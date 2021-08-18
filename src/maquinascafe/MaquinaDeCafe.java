package maquinascafe;

public abstract class MaquinaDeCafe {
	
	protected int gramosDeCafe;
	protected static final int GRAMOS_POR_CAFE = 10;
	protected static final int GRAMOS_INICIAL_DE_CAFE = 1000;
	
	public MaquinaDeCafe() {
		this.gramosDeCafe = GRAMOS_INICIAL_DE_CAFE;
	}
	
	public VasoDeCafe servirCafe() {
		if(this.puedeServir()) {
			this.restarCafe();
			return new VasoDeCafe(true);
		}
		return new VasoDeCafe(false);
	}
	
	protected void restarCafe() {
		this.gramosDeCafe -= GRAMOS_POR_CAFE;
	}
	
	protected boolean puedeServir() {
		
		return this.gramosDeCafe >= GRAMOS_POR_CAFE;
	}

}
