
bash "$parent_path"/gencode/Fiware/ParalelDeploy/CreateMachines.sh

wait

bash "$parent_path"/gencode/Fiware/ParalelDeploy/Dockerize.sh

