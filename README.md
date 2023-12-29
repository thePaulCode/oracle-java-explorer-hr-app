# Human Resource App

Este projeto Java foi desenvolvido como parte do Oracle Learning Explorer. Ele inclui as classes `HRapp`, `Department`, e `Employee`, que são explicadas abaixo.

## Diagrama de Classes

![Diagrama de Classes](https://mermaid.ink/img/pako:eNqtVMGK2zAQ_RWhk0Mdo6wT1zG0sCQ95JBlaXJYWi9FlZVEYEtGkkt3Q_69sq2kk40XeqgvFjPvzRvpDXPETBUcZ5iV1JiloHtNq1wi93URtDmo-r6u0bEPtt-HigoZbKwWcv_9GVG9N6M-e8ol5C5KZQ8OhCB73BNRwQ3TorZCSZBcquZnyVGtBeO3HCNeOfqEcrzOMehnJyQtkbHUCoZ8hfXq4cfj19Xii8NPSEQA3AN7lodv758ckER3QHTRGKsqrhHzB1DjfLXg9jYhgpcIkUfQjWt-BEr4-J7b5V9yABG_lCiQuc7f6kGGV3Y1H1vxwWp9BvY43FXb72CBLgEcGaBb1R-u-EJaxFRVU823KrgMB3tneM6vPzA7klbvTAe0zwu4ERWWVwak2k4qTk2jecWl5dBYLxsAqRC9Jdw8Cy2KVSsSAFXmj6OBuXFp98Q9ZdjArbK0PMMXythg2KYH12DwHx28woB7_4PLFwfPS2M8_nzxcSDjL9dnLn5fp3CIXdBtnMItqW4UcmwPzoUcZ-5Y8B1tStuug5OD0sb19CIZzqxueIibuqCW-7WGsx0tjYvWVOLsiH_jbDKfRMksvkviSTydxWkSh_gFZ-k0mpMpmaVJQqYpmcWnEL8q5SqQ6CMhaUriZE5IMkvnSYh5IazSa79H218n8a0jtH2c_gAG_Kg_?type=png)
## Classes

### 1. HRapp
A classe `HRapp` contém o método `main(String[] args)`, que é o ponto de entrada principal para a aplicação. Este método inicia a execução do aplicativo de recursos humanos.

### 2. Department
A classe `Department` representa um departamento e possui os seguintes atributos:
- `name`: Uma string que armazena o nome do departamento.
- `newEmployees`: Um array de objetos `Employee` que armazena os funcionários do departamento.
- `lastAddedEmployeeIndex`: Um inteiro que indica o índice do último funcionário adicionado.

Métodos importantes incluem:
- `addEmployee(anEmployee)`: Adiciona um funcionário ao departamento.
- `getAllEmployee()`: Retorna um array contendo todos os funcionários do departamento.
- `getAnEmployeeById(id)`: Retorna um objeto `Employee` com base no ID fornecido.
- `getTotalEmployess()`: Retorna o número total de funcionários no departamento.
- `getTotalSalary()`: Retorna o salário total de todos os funcionários no departamento.
- `getAverageSalary()`: Retorna a média salarial de todos os funcionários no departamento.
- `setName(name)`: Define o nome do departamento.

### 3. Employee
A classe `Employee` representa um funcionário e possui os seguintes atributos:
- `id`: Um inteiro que armazena o ID do funcionário.
- `name`: Uma string que armazena o nome do funcionário.
- `salary`: Um double que armazena o salário do funcionário.

Métodos importantes incluem:
- `getId()`: Retorna o ID do funcionário.
- `getName()`: Retorna o nome do funcionário.
- `getSalary()`: Retorna o salário do funcionário.
- `setId(id)`: Define o ID do funcionário.
- `setName(name)`: Define o nome do funcionário.
- `setSalary(salary)`: Define o salário do funcionário.

## Testes

Para testar este projeto, é recomendável criar casos de teste para cada método em cada classe. Isso garantirá que cada componente funcione conforme esperado. Exemplos de testes podem incluir adicionar funcionários, calcular salários totais e médios, e recuperar funcionários com base em IDs.

Lembre-se de incluir casos de teste que cubram situações limite e casos de erro para garantir que o código seja robusto e manutenível.

**Nota:** Este é um exemplo básico, e testes mais abrangentes podem ser necessários dependendo dos requisitos específicos do projeto.

## Saída Esperada

<a href="https://imgbb.com/"><img src="https://i.ibb.co/wpRCDWM/oracle-api-hr.png" alt="oracle-api-hr" border="0"></a>

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).