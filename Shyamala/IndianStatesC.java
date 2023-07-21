class IndianStatesC{
	String stateName;
	int statePopulation;
	int maleCount;
	int femaleCount;
	int gdp;

	
	public IndianStatesC(String stateName,int statePopulation,int maleCount,int femaleCount,int gdp)
	{
	System.out.println("Constructor");
	this.stateName=stateName;
	this.statePopulation=statePopulation;
	this.maleCount=maleCount;
	this.femaleCount=femaleCount;
	this.gdp=gdp;
	}

	public static void main(String args[]){
	IndianStatesC states=new IndianStatesC("ap",2500,600,800,20);
	System.out.println(states);
	}

	public String toString(){
	return "IndianStatesC[stateName="+stateName+", statePopulation="+statePopulation+", maleCount="+maleCount+", femaleCount="+femaleCount+", gdp="+gdp+"]";
	}
}
