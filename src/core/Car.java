package core;

public class Car
{
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public void setNumber(String number)
    {
        this.number = number;
    }
    public String getNumber()
    {
        return number;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }
    public int getHeight()
    {
        return height;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setHasVehicle(boolean hasVehicle)
    {
        this.hasVehicle = hasVehicle; //1
    }
    public boolean getHasVehicle()
    {
        return hasVehicle;
    }
    public void setIsSpecial(boolean isSpecial)
    {
        this.isSpecial = isSpecial;
    }
    public boolean getIsSpecial()
    {
        return isSpecial;
    }
    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
                special + "Автомобиль с номером " + number +
                ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}