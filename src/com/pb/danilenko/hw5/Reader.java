package com.pb.danilenko.hw5;

public class Reader {

    private String fio;
    private String biletn;
    private String fak;
    private String birthday;
    private String tel;
    private int kolichestvo;

    public Reader (String fio, int kolichestvo, String biletn, String fak, String birthday, String tel)
    {
        this.fio = fio;
        this.biletn = biletn;
        this.fak = fak;
        this.birthday = birthday;
        this.tel = tel;
        this.kolichestvo = kolichestvo;
    }

  //   public Reader() {
 //   }

    public int getKolichestvo() {
        return kolichestvo;
    }

    public void setKolichestvo(int kolichestvo) {
        this.kolichestvo = kolichestvo;
    }

    public String getFio () {
        return fio;
    }

    public void setFio (String fio) {
        this.fio = fio;
    }

    public String getBiletn () {
        return biletn;
    }

    public void setBiletn (String biletn) {
        this.biletn = biletn;
    }

    public String getFak () {
        return fak;
    }

    public void setFak (String fak) {
        this.fak = fak;
    }

    public String getBirthday () {
        return birthday;
    }

    public void setBirthday (String birthday) {
        this.birthday = birthday;
    }

    public String getTel () {
        return tel;
    }

    public void setTel (String tel) {
        this.tel = tel;
    }

    public void takeBook(int number) {
        System.out.println(this.fio + " взял " + number + " книги.");
    }

    public void takeBook(String... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getTitle() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }

    public void returnBook(int kolichestvo) {
        System.out.println(this.fio + " вернул " + kolichestvo + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getTitle() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }

    public String getInfo() {
        return "{" +
                "ФИО='" + fio + '\'' +
                ", КОЛИЧЕСТВО=" + kolichestvo +
                ", ФАКУЛЬТЕТ='" + fak + '\'' +
                ", ДАТА РОЖДЕНИЯ='" + birthday + '\'' +
                ", ТЕЛЕФОН='" + tel + '\'' +
                '}';
    }




}


