package com.pb.danilenko.hw7;



public enum Size {
    XXS, XS,S,M,L;

    private String Size;

    Size(String Size) {
        this.Size = Size;
    }

    Size () {

    }

    @Override
    public String toString() {
        return Size;
    }


    public String description;
    public int euroSize;

    Size (String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription () {
        if (Size == "XXS") System.out.println("Детский размер");
            else System.out.println("Взрослый размер");

        return description;
    }



    public int getEuroSize () {
            switch (euroSize){
                case 32: System.out.println("XXS");
                case 34: System.out.println("XS");
                case 36: System.out.println("S");
                case 38: System.out.println("M");
                case 40: System.out.println("L");
            }
        return euroSize;
    }
}




