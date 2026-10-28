# produtos-soap

Web Service SOAP de consulta de produtos (Spring Boot 3.3.4, Java 17).

WSDL: http://localhost:8080/ws/produtos.wsdl

## Segurança

O serviço usa WS-Security (UsernameToken). Toda requisição precisa enviar usuário e senha no header SOAP:

- Usuário: admin
- Senha: 123456

Para códigos de produto inexistentes, o serviço retorna um SOAP Fault ("Produto com código X não encontrado"). Requisições sem credenciais ou com credenciais erradas retornam um SOAP Fault de segurança.
