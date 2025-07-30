package myListClass;

public class main {

        public static void main(String[] args)
        {
            list<Integer> Liste = new list<>();
            System.out.println("Liste Durumu : " + (Liste.isEmpty() ? "Boş" : "Dolu"));
            Liste.add(10);
            Liste.add(20);
            Liste.add(30);
            Liste.add(40);
            Liste.add(20);
            Liste.add(50);
            Liste.add(60);
            Liste.add(70);

            System.out.println("Liste Durumu : " + (Liste.isEmpty() ? "Boş" : "Dolu"));

            // Bulduğu ilk indeksi verir
            System.out.println("Indeks : " + Liste.getIndex(20));

            // Bulamazsa -1 döndürür
            System.out.println("Indeks :" + Liste.getIndex(100));

            // Bulduğu son indeksi verir
            System.out.println("Indeks : " + Liste.lastIndexOf(20));

            // Listeyi Object[] dizisi olarak geri verir.
            Object[] dizi = Liste.toArray();
            System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

            // Liste veri türünde alt bir liste oluşturdu
            list<Integer> altListem = Liste.subList(0, 3);
            System.out.println(altListem.toString());

            // Değerim listedeki olup olmadığını sorguladı
            System.out.println("Listemde 20 değeri : " + Liste.contains(20));
            System.out.println("Listemde 120 değeri : " + Liste.contains(120));

            // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
            Liste.clear();
            System.out.println(Liste.toString());

        }
}
