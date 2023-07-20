class IndianStates{
	String stateName;
	int statePopulation;
	int maleCount;
	int femaleCount;
	int gdp;

	
	public IndianStates(String stateName,int statePopulation,int maleCount,int femaleCount,int gdp)
	{
	System.out.println("Constructor");
	this.stateName=stateName;
	this.statePopulation=statePopulation;
	this.maleCount=maleCount;
	this.femaleCount=femaleCount;
	this.gdp=gdp;
	}

	public static void main(String args[]){
	IndianStates states=new IndianStates("ap",2500,600,800,20);
	System.out.println(states);
	}

	public String toString(){
	return "IndianStates[stateName="+stateName+", statePopulation="+statePopulation+", maleCount="+maleCount+", femaleCount="+femaleCount+", gdp="+gdp+"]";
	}
}