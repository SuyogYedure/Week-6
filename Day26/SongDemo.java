class Song{
  void play(){
    System.out.println("Plays Song");
  }
}
class Popsong extends Song{
  void play(){
    super.play();
    System.out.println("Pop Song play with catchy beats and chorus");
  }
}
class Jazzsong extends Song{
  void play(){
    super.play();
    System.out.println("Jazz Song play with the audio with a smooth melody and improvisation.");
  }
}
class SongDemo{
  public static void main(String args[]){
    Popsong p = new Popsong();
    p.play();
    Jazzsong j = new Jazzsong();
    j.play();
  }
}