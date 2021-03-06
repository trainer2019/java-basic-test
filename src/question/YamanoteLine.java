package question;

public class YamanoteLine {
    public static void main(String[] args) {

        int ahead = Integer.parseInt(args[0]);

        // 山手線駅(29駅)を新宿駅から内回りの順で
        String[] stations = {"新宿", "代々木", "原宿", "渋谷", "恵比寿", "目黒",
                "五反田", "大崎", "品川", "田町", "浜松町", "新橋", "有楽町", "東京",
                "神田", "秋葉原", "御徒町", "上野", "鶯谷", "日暮里", "西日暮里", "田端",
                "駒込", "巣鴨", "大塚", "池袋", "目白", "高田馬場", "新大久保"};
        final int stationCount = stations.length;

        String currentStation = stations[0];
        System.out.println("◇ " + currentStation + "駅を出発します。");

        int i = 0;
        while (i < ahead) {
            i++;
            currentStation = stations[(i) % stationCount];

            // 0.5秒待つ処理
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == ahead) {
                System.out.println("◆ " + currentStation + "駅に到着しました。");

            } else {
                System.out.println("ただいま" + currentStation + "駅です。");
            }
        }
    }
}
