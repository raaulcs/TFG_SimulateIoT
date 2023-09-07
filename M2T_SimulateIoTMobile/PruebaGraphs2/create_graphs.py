import os, glob, re
import matplotlib.pyplot as plt

logs_path = os.path.dirname(os.path.realpath(__file__)) + "/DeployV2/kubernetes/logs"

# Función para buscar y extraer valores en los archivos de registro
def extraer_valores(archivo):
    valores_individuales = []  # Lista para almacenar valores individuales de un archivo
    count = []
    with open(archivo, "r") as file:
        for linea in file:
            if linea.startswith("DEVICE "):
                # Utilizar expresión regular para extraer el valor de "value"
                match = re.search(r'"value"\s*:\s*"([^"]+)"\s*,?', linea)
                if match:
                    valor = match.group(1)
                    if "." in valor:
                        valores_individuales.append(
                            float(valor)
                        )  # Convertir a flotante si tiene punto decimal
                    elif valor.isnumeric():
                        valores_individuales.append(
                            int(valor)
                        )  # Convertir a entero si es un número entero
                    else:
                        if(len(valores_individuales) == 0):
                            valores_individuales.append(str(valor))
                            count.append(int(1))
                        else:
                            found = 'false'
                            for elem in valores_individuales:
                                if(elem == valor):
                                    count[valores_individuales.index(valor)] = count[valores_individuales.index(valor)] + 1
                                    found = 'true'
                            if(found == 'false'):
                                valores_individuales.append(str(valor))
                                count.append(int(1))
    return valores_individuales,count
    


# Recorrer archivos en el directorio de logs
for archivo in os.listdir(logs_path):
    if archivo.startswith("sensor-") and archivo.endswith(".log"):  
        ruta_logs = os.path.join(logs_path, archivo)
        valores_archivo,count = extraer_valores(ruta_logs)

        ruta_graphs = logs_path+'/graphs'

        # Crea el directorio si no existe
        if not os.path.exists(ruta_graphs):
        	os.makedirs(ruta_graphs)

        ruta_completa = os.path.join(ruta_graphs, archivo)

        # Borrar los datos de plt
        plt.clf()

        # Personalizar la gráfica (opcional)
        plt.xlabel("Índice")
        plt.ylabel("Valor")
        plt.title("Gráfico de "+ archivo)

        if type(valores_archivo[0]) != str:
            # Crear una gráfica lineal
            plt.plot(valores_archivo)
        else:
            # Crear una gráfica de barras
            plt.bar(valores_archivo,count)
        
        # Mostrar la gráfica
        plt.savefig(ruta_completa + ".png")
