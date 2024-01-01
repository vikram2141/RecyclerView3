package com.example.recyclerview3;

public class contentmodel {
    String name;
    String email;
    int img;
    contentmodel(String name,String email,int image)
    {
        this.name=name;
        this.email=email;
        this.img=image;
    }
   public contentmodel(String name,String email){
        this.name =name;
       this.email=email;

   }

   // Bhavesh kumar
    // Vikarm kuamr tesht pass

    public int getImg(){return img;}
    public void setImg (int img){this.img = img;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}
}
