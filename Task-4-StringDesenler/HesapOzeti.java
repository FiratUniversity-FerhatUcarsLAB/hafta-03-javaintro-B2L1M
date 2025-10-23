public class HesapOzeti {
    public static void main(String[] args) {
        
        String baslik = "      Alışveriş Listesi      ";
        String cizgi = "-------------------------------";
        
        String Urun = "Ürün";
        String Miktar = "Miktar";
        String Fiyat = "Fiyat";
        
        String urun1 = "Elma";
        String miktar1 = "2kg";
        String fiyat1 = "10TL";
        
        String urun2 = "Armut";
        String miktar2 = "3kg";
        String fiyat2 = "15TL";

        String urun3 = "Muz";
        String miktar3 = "1kg";
        String fiyat3 = "12TL";
        
        System.out.println(baslik);
        System.out.println(cizgi);
        
        System.out.println("     " + Urun + "    " + Miktar + "    " + Fiyat + "    ");
        System.out.println(cizgi);
    
        System.out.println("     " + urun1 + "    " + miktar1 + "       " + fiyat1 + "     ");
        System.out.println("     " + urun2 + "   " + miktar2 + "       " + fiyat2 + "     ");
        System.out.println("     " + urun3 + "     " + miktar3 + "       " + fiyat3 + "     ");
        
        System.out.println(cizgi);
    }
}
