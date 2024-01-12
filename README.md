
### Referencia da Documentação 

* [Objetivos](#Objetivos)


* [Grooming](#Grooming)


* [Sistema](#Sistema)


* [Premissas](#Premissas)


* [Ações](#Ações)


* [Exemplo](#Exemplo)


* [Cenarios](#Cenarios)


* [Banco de Dados](#BancoDeDados)


* [Estrutura de Packages / Padrão nomeclatura arquivos](#)


* [Padrão de logs](#Padrãodelogs)


* [Link's reference](#Link'sreference)


## Objetivos


Abordar os conteudos: Ecossistema Spring, Kotlin e o Clean Architectura e outros Design Pattern's na prática



## Grooming


O termo se refere à preparação de backlog  (que são os requisitos ou lista de pendências) e é mais adequadamente conhecido como refinamento. É o ato de detalhar, entender mais profundamente, adicionar características, estimar, priorizar e manter o backlog do produto vivo.


##### Sistema

                    UserMicroservice

    [Servidor]                   Spring Boot

    [Banco de dados]             Spring Data / PostgreSQL

    [Linguagem]                  Kotlin

    [Design Pattern's]           Clean Architecture / Strategy / Chain Of Responsability / Builder

    [Mensageria]                 Rabbit 

    [Documentação do Projeto]    Swagger


###### Premissas

    Gerenciar dados dos usuarios;

    DataBase própria;


###### Ações


    1. Criar usuario                    POST localhost:8081/v1/driver        
    2. Buscar usuario                   GET  localhost:8081/v1/driver
    3. Alterar dados usuario            PUT  localhost:8081/v1/driver
    4. Deletar dados usuario           DELETE localhost:8081/v1/driver

###### Exemplo 
Para cadastrar um Driver vai no POSTMAN e crie um método POST.

O corpo (body) do método POST é JSON e deve conter:

          {
            "id": 1,
            "name":"layon",
            "cellphone": "11971107968",
            "email": "layon.300@hotmail.com",
            "active": true,
           
        }

###### Cenarios

    1.Criar Usuario:
        1.1 Criar usuario na base PostgreSQL;

    2.Buscar Usuario:
        2.1 Buscar todos os usuarios;

    3.Alterar dados usuario:
        3.1 Alterar dados na base PostgreSQL;

    4. Excluir dados usuarios. 




#### Banco de Dados

                    Create database driver;			
			--DROP DATABASE driver;
			
			grant all privileges on database driver to postgres;			
			
			CREATE TABLE public.tb_driver(
			id_driver bigint PRIMARY KEY,
			nome varchar(255),
			telefone varchar(255),
			email varchar(255),
			ativo boolean,
			dh_criacao timestamp,
			dh_alteracao timestamp,
			dh_exclusao timestamp);



#### Estrutura de Packages / Padrão nomeclatura arquivos


          Entities: 
         
             Domain:
                 Driver -> Objeto pertinente a camada do banco;
                 DriverEntity -> Objeto para transacionar fora da camada de repositorio;
            
             DTO:
                 RequestPostDriverEntity -> Objeto de request para integrações
                 RequestPutDriverEntity -> Objeto de request para integrações
                 RequestDeleteDriverEntity -> Objeto de request para integrações

                 ResponseGetDriverEntity -> Objeto de retorno de request para integrações


            Exception:
                 DriverException: -> Classe de exceção;


        Repository:
            Repository:
                 DriverRepository -> Interface de comunicação com BD;
            Domain
                 Driver -> Classe de referencia ao BD;
            Config
                 DataBaseConfig -> Bean de configuração do BD


        Usecases:
            Service:
                 DriverService -> Interface;
                 DriverServiceImpl -> Implementação;          


        Web:
            Controller:
                 DriverController -> Camada responsável por receber as requisições;
            Config
                 SwaggerConfig -> Bean responsavel pela config do Swagger





#### Padrão de logs

        runCatching {
            LOG.info("START {} driver: {} body {}", methodName/service?, cpf, body)

            service.execute();

        }.onFailure {
            LOG.error("ERROR {} driver: {} statusCode: {} cause: {} message: {}", methodName/service?, cpf, statusCodeResponse, causeResponse, messageResponse)
            
            throw it

        }.onSucesss {
            LOG.info("END {} driver: {}", methodName/service?, cpf)
        }


#### Link's reference

        Clean Architecture    https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html

        Strategy              https://en.wikipedia.org/wiki/Strategy_pattern

        Builder               https://pt.wikipedia.org/wiki/Builder

        Swagger               https://medium.com/@raphaelbluteau/spring-boot-swagger-documentando-sua-api-automaticamente-27903293aeb6


#### Personas


Robert Martin -> Clean Code && Clean Architecture
