public class Client {
    public static void main(String[] args) {
        Book[] books =new  Book[10];
        books[0] = new ProgrammingBook(1, "Tớ Học Lập Trình", 100, "Nhiều tác giả", "Java", "Scratch");
        books[1] = new ProgrammingBook(2, "Lập Trình Và Cuộc Sống", 105, "Jeff Atwood", "Java", "Kinh nghiệm");
        books[2] = new ProgrammingBook(3, "Code Dạo Kí Sự ", 120, "Phạm Huy Hoàng", "C++", "Lập trình cơ bản");
        books[3] = new ProgrammingBook(4, "Ngôn Ngữ Lập Trình C Và C++", 80, "Ngô Trung Việt", "C#", "Scratch");
        books[4] = new ProgrammingBook(5, "Lập Trình Với C# Xây Dựng Ứng Dụng", 110, "Nhiều tác giả", "Java", "C#");

        books[5] = new FictionBook(1, "NGƯỜI MÁY CÓ MƠ VỀ CỪU ĐIỆN KHÔNG?", 75, "Philip K.Dick", "Viễn tưởng 1");
        books[6] = new FictionBook(2, "80 NGÀY VÒNG QUANH THẾ GIỚI", 105, "Jules Gabriel Verne", "Viễn tưởng 3");
        books[7] = new FictionBook(3, " HAI VẠN DẶM DƯỚI ĐÁY BIỂN", 125, "HUY HOÀNG", "Viễn tưởng 2");
        books[8] = new FictionBook(4, "CUỘC THÁM HIỂM VÀO LÒNG ĐẤT?", 85, "Quang Anh", "Viễn tưởng 2");
        books[9] = new FictionBook(5, "MÃI ĐỪNG XA TÔI", 175, "Kazuo", "Viễn tưởng 1");

        System.out.println("Tổng giá tiền 10 cuốn sách là " + tinhtong(books) + "K");
        System.out.println("Số sách ProgrammingBook có language là Java: "+demsopro(books, "Java")+ " quyển");
        System.out.println("Số sách Fiction có category là Viễn tưởng 1: " +demsofi(books,"Viễn tưởng 1")+" quyền" );

        System.out.println("Số sách Fiction có giá <100 là: " + demtien(books) +" quyển");
    }

    //
    public static int tinhtong(Book books[]) {
        int sumpro = 0;
        for (int i = 0; i < books.length; i++) {
            sumpro += books[i].price;
        }
        return sumpro;
    }


    public static int demsopro(Book books[],String language ) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof ProgrammingBook) {
                String language1 = ((ProgrammingBook) books[i]).getLanguage();
                if (language1.equals(language)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int demsofi(Book books[], String category) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                String language2 = ((FictionBook) books[i]).getCategory();
                if (language2.equals(category)) {
                    count++;
                }
            }

        }return count;
    }
    public static int demtien(Book books[]){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].price <100) {
                count++;
            }
        }return count;
    }
    }
