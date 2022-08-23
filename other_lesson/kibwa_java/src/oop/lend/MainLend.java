package oop.lend;

public class MainLend {
    public static void main(String[] args) {
//        SeparateVolume_impl sv = new SeparateVolume_impl("123", "나무소녀", "누구였더라");
//        sv.checkOut("김ㅂㅂ", "오늘날자");
//        sv.checkIn();

        AppCDInfo_impl ac = new AppCDInfo_impl("321", "wake me up");
        ac.checkOut("익명인", "오늘날짜");
        ac.checkIn();
    }
}
