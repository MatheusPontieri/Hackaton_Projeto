# HiperMellitos

HiperMellitos é um aplicativo voltado para pessoas com hipertensão e diabetes, oferecendo acompanhamento diário das análises de seu estado atual. O diferencial é permitir que profissionais de saúde acessem o histórico dos pacientes para um monitoramento próximo. Além disso, é possível agendar consultas para renovação de receitas, acompanhar o vencimento das prescrições e outras funcionalidades úteis.

## Executando o back-end e banco de dados

O back-end foi desenvolvido utilizando o framework Quarkus (Java).
A aplicação back-end pode ser executada em modo dev que ativa o live codingo usando: 

```shell script
./mvnw compile quarkus:dev
```
Obs.: A api foi disponibilizada para ser acessada por meio do link definido nas rotas do Flutter, podendo ser acessada de qualquer lugar. Para isto, foi utilizada a tecnologia NgRok.

Para executar o banco de dados, deve-se ter o Docker instalado na máquina, pois já foi baixado no projeto o arquivo de conexão com este banco. Ou pode-se adicionar configurações personalizadas no arquivo application.properties:

```shell script
quarkus.datasource.db-kind = postgresql 
quarkus.datasource.username = usuario_banco
quarkus.datasource.password = senha_banco
quarkus.datasource.jdbc.url = jdbc:postgresql://localhost:5432/nome_banco
```

## Executando o front-end 
O front-end foi desenvolvido utilizando a ferramenta FlutterFlow. Desse modo, utilizou-se esta tecnologia para a interface, juntamente com Quarkus para back-end e PostgreSql como banco de dados sendo executado no Docker.

* Acesse o site oficial do Flutter: https://flutter.dev/docs/get-started/install


* Adicione o diretório flutter/bin ao PATH do seu sistema para poder usar o comando flutter no terminal.

* Abra um terminal ou prompt de comando e execute:

```shell script
flutter doctor
```
