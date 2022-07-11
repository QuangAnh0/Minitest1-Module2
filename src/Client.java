public class Client {
    public static void main(String[] args) {
        ProgrammingBook probook1 = new ProgrammingBook(1, "Tớ Học Lập Trình", 100, "Nhiều tác giả", "Java", "Scratch");
        ProgrammingBook probook2 = new ProgrammingBook(2, "Lập Trình Và Cuộc Sống", 105, "Jeff Atwood", "Java", "Kinh nghiệm");
        ProgrammingBook probook3 = new ProgrammingBook(3, "Code Dạo Kí Sự ", 120, "Phạm Huy Hoàng", "C++", "Lập trình cơ bản");
        ProgrammingBook probook4 = new ProgrammingBook(4, "Ngôn Ngữ Lập Trình C Và C++", 80, "Ngô Trung Việt", "C#", "Scratch");
        ProgrammingBook probook5 = new ProgrammingBook(5, "Lập Trình Với C# Xây Dựng Ứng Dụng", 110, "Nhiều tác giả", "Java", "C#");

        FictionBook fibook1 = new FictionBook(1, "NGƯỜI MÁY CÓ MƠ VỀ CỪU ĐIỆN KHÔNG?", 75, "Philip K.Dick", "Viễn tưởng 1");
        FictionBook fibook2 = new FictionBook(2, "80 NGÀY VÒNG QUANH THẾ GIỚI", 105, "Jules Gabriel Verne", "Viễn tưởng 3");
        FictionBook fibook3 = new FictionBook(3, " HAI VẠN DẶM DƯỚI ĐÁY BIỂN", 125, "HUY HOÀNG", "Viễn tưởng 2");
        FictionBook fibook4 = new FictionBook(4, "CUỘC THÁM HIỂM VÀO LÒNG ĐẤT?", 85, "Quang Anh", "Viễn tưởng 2");
        FictionBook fibook5 = new FictionBook(5, "MÃI ĐỪNG XA TÔI", 175, "Kazuo", "Viễn tưởng 1");

        Book[] array1 = {fibook1, fibook2, fibook3, fibook4, fibook5, probook1, probook2, probook3, probook4, probook5};
        ProgrammingBook[] array2 = {probook1, probook2, probook3, probook4, probook5};
        FictionBook[] array3={fibook1,fibook2,fibook3,fibook4,fibook5};
        System.out.println("Tổng giá tiền 10 cuốn sách là " + tinhtong(array1) + "K");
        System.out.println("Số sách ProgrammingBook có language là Java: " + demsopro(array2) + " quyển ");
        System.out.println("Số sách Fiction có category là Viễn tưởng 1: " +demsofi(array3)+" quyền" );
        System.out.println("Số sách Fiction có giá <100 là: " + demtien(array3) +" quyển");
    }

    public static int tinhtong(Book x[]) {
        int sumpro = 0;
        for (int i = 0; i < x.length; i++) {
            sumpro += x[i].price;
        }
        return sumpro;
    }

    public static int demsopro(ProgrammingBook x[]) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].getLanguage() == "Java") {
                count++;

            }
        }
        return count;
    }

    public static int demsofi(FictionBook x[]) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].getCategory() == "Viễn tưởng 1") {
                count++;
            }
        }return count;
    }
    public static int demtien(Book x[]){
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].price <100) {
                count++;
            }
        }return count;
    }
}





