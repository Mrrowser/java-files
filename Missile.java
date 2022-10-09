class Missile
{
	private int serialNumber;
	private String target;
	private String status;

	Missile(int serialNumber, String target, String status)
	{
		this.serialNumber = serialNumber;
		this.target = target;
		this.status = status;
	}
	//setters
	public void setSerialNumber(int serialNumber)
	{
		this.serialNumber = serialNumber;
	}
	public void setTarget(String target)
	{
		this.target = target;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	//getters
	public int getSerialNumber()
	{
		return this.serialNumber;
	}
	public String getTarget()
	{
		return this.target;
	}
	public String getStatus()
	{
		return this.status = status;
	}
	public String fire()
	{

	}
	public String selectTarget()
	{

	}
}
