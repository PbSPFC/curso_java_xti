
package facul;


public class GetSet {
    
    private String nome;
	public String getNome(){
		return nome;
	}
	public void setNome(String n){
		this.nome = n;
	}
	
	
	
	
	private String pai;
	public String getPai(){
		return pai;
	}
	public void setPai(String p){
		this.pai = p;
	}
        
        
        
        
        private String mae;
        public String getMae(){
            return mae;
        }
        public void setMae (String m) {
                this.mae = m;
        }
        
        
        
        private boolean casado;
        public boolean isCasado() {
            return casado;
        }
        public void setCasado (boolean c){
            this.casado = c;
        }
        
        
}
