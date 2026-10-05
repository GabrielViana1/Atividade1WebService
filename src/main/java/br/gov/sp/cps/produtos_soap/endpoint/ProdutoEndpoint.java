package br.gov.sp.cps.produtos_soap.endpoint;

import br.gov.sp.cps.produtos_soap.model.ConsultarProdutoRequest;
import br.gov.sp.cps.produtos_soap.model.ConsultarProdutoResponse;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProdutoEndpoint {

    private static final String NAMESPACE = "http://cps.sp.gov.br/produtos";

    @PayloadRoot(namespace = NAMESPACE, localPart = "consultarProdutoRequest")
    @ResponsePayload
    public ConsultarProdutoResponse consultarProduto(@RequestPayload ConsultarProdutoRequest request) {

        ConsultarProdutoResponse response = new ConsultarProdutoResponse();

        if (request.getCodigo() == 1) {

            response.setNome("Hub USB-C 7 em 1");
            response.setDescricao("Adaptador com HDMI, leitor de cartao SD e 3 portas USB");
            response.setMarca("Baseus");
            response.setQuantidadeEstoque(13);

        } else if (request.getCodigo() == 2) {

            response.setNome("Base Refrigerada para Notebook");
            response.setDescricao("Suporte com 2 ventoinhas silenciosas e altura ajustavel");
            response.setMarca("Multilaser");
            response.setQuantidadeEstoque(31);

        } else if (request.getCodigo() == 3) {

            response.setNome("Pendrive 128GB");
            response.setDescricao("Pendrive USB 3.2 com tampa retratil");
            response.setMarca("SanDisk");
            response.setQuantidadeEstoque(8);

        } else {

            response.setNome("Produto nao encontrado");
            response.setDescricao("-");
            response.setMarca("-");
            response.setQuantidadeEstoque(0);
        }

        return response;
    }
}
