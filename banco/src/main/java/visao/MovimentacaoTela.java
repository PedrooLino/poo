package visao;

import java.util.Date;

import controle.MovimentacaoControle;
import dao.ClienteDAO;
import dao.ContaDAO;
import entidade.Cliente;
import entidade.Conta;
import entidade.ContaTipo;
import entidade.Movimentacao;

public class MovimentacaoTela {

	public static void main(String[] args) {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		ContaDAO contaDao = new ContaDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCpf("00000000000");
		cliente.setNome("José Antônio da Silva");
		clienteDAO.inserir(cliente);
		
		Conta conta = new Conta();
		conta.setDataAbertura(new Date());
		conta.setCliente(cliente);
		conta.setContaTipo(ContaTipo.CONTA_CORRENTE);
		contaDao.inserir(conta);
	
		
		
		MovimentacaoControle controle = new MovimentacaoControle();
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setDataTransacao(new Date());
		movimentacao.setDescricao("Depósito de 500,00 no dia 03/10/24");
		movimentacao.setTipoTransacao("depósito");
		movimentacao.setValorOperacao(500.);
		
		controle.inserir(movimentacao);
	}

}
