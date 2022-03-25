package modelos.cliente;

public class Reserva extends Cliente {
		
		public Reserva () {
		
		}
		private int idCliente;
		private int idReserva;
		private String origem;
		private String destino;
		private String partida;
		private String retorno;
		private String quantPassagens;
		private String pagamento;
		private String parcelas;
		private double valorTotal;
		
		public int getIdcliente() {
			return idCliente;
		}
		public void setIdcliente(int idCliente) {
			this.idCliente = idCliente;
		}
		public int getIdreserva() {
			return idReserva;
		}
		public void setIdreserva(int idReserva) {
			this.idReserva = idReserva;
		}
		public String getOrigem() {
			return origem;
		}
		public void setOrigem(String origem) {
			this.origem = origem;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public String getPartida() {
			return partida;
		}
		public void setPartida(String partida) {
			this.partida = partida;
		}
		public String getRetorno() {
			return retorno;
		}
		public void setRetorno(String retorno) {
			this.retorno = retorno;
		}
		public String getQuantpassagens() {
			return quantPassagens;
		}
		public void setQuantpassagens(String quantPassagens) {
			this.quantPassagens = quantPassagens;
		}
		public String getPagamento() {
			return pagamento;
		}
		public void setPagamento(String pagamento) {
			this.pagamento = pagamento;
		}
		public String getParcelas() {
			return parcelas;
		}
		public void setParcelas(String parcelas) {
			this.parcelas = parcelas;
		}
		public double getValorTotal() {
			return valorTotal;
		}
		public void setValortotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}
		

}
