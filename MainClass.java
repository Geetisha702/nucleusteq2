
class phone {
    void call()
    {   System.out.println("start call");}
    void sms()
    {   System.out.println("start texting");}
    
    
}


interface Camera{
    abstract void click();
    
      abstract void record();
      
}
interface MusicPlayer{
    abstract void play();
    
      abstract void stop();
      
}

class SmartPhone extends phone implements Camera,MusicPlayer{

    
    @Override
    public void click() {
           System.out.println("click to stop recording");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void record() {
          System.out.println("start recording");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void play() {
          System.out.println("start player");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop() {
        System.out.println("stop player");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}public 
class MainClass{
    public static void main(String...ar)
    {Camera c=new SmartPhone();
MusicPlayer mp=new SmartPhone();
SmartPhone sp=new SmartPhone();
c.click();
c.record();
mp.play();
mp.stop();
sp.call();
sp.sms();
    }
}