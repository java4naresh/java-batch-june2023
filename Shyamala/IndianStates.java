class IndianStates{
String StateName;
double Statepopulation;
float malecount;
float femalecount;
int GDP;
public static void main(String[] args)
{
IndianStates indianstates = new IndianStates();
indianstates.StateName = "Andhrapradesh";
indianstates.Statepopulation = 500000;
indianstates.malecount = 260000;
indianstates.femalecount = 240000;
indianstates.GDP = 130;
System.out.println(indianstates);
}
public String toString(){
return "IndianStates[StateName="+StateName+",Statepopulation="+Statepopulation+",malecount="+malecount+",femalecount="+femalecount+",GDP="+GDP+"]";
}
}

