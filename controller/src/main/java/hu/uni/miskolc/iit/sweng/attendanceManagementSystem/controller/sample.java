package hu.uni.miskolc.iit.sweng.attendanceManagementSystem.controller;
interface A
{
    public void aaa();
}
interface B
{
    public int aaa();
}

class Central implements A,B
{

    public void aaa() // error
    {
    }
    public int aaa() // error
    {
    }
    public static void main(String args[])
    {

    }
}