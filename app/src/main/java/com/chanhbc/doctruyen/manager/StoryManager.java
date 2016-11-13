package com.chanhbc.doctruyen.manager;

import com.chanhbc.doctruyen.R;
import com.chanhbc.doctruyen.model.Story;

import java.util.ArrayList;

public class StoryManager {
    private ArrayList<Story> stories;
    private ArrayList<Story> storiesFunny;
    private ArrayList<Story> storiesFolk;
    private ArrayList<Story> storiesCoTich;
    private ArrayList<Story> storiesNguNgon;
    private ArrayList<Story> storiesLove;
    private ArrayList<Story> storiesTieuLam;
    private ArrayList<Story> storiesShort;
    private ArrayList<Story> storiesCongSo;
    private ArrayList<Story> storiesTamQuoc;
    private ArrayList<Story> storiesOther;
    private static StoryManager instance;

    public StoryManager() {
        stories = new ArrayList<Story>();
        addArrListStoryFunny();
        addArrListStoryFolk();
        addArrListStoryCoTich();
        addArrListStoryNguNgon();
        addArrListStoryLove();
        addArrListStoryTieuLam();
        addArrListStoryShort();
        addArrListStoryCongSo();
        addArrListStoryTamQuoc();
        addArrListStoryOther();
    }

    private void addArrListStoryCoTich() {
        storiesCoTich = new ArrayList<Story>();
        for (int i = 0; i < 10; i++)
            storiesCoTich.add(new Story(R.drawable.ic_cotich, "Story " + i, "Story " + i));
    }

    private void addArrListStoryNguNgon() {
        storiesNguNgon = new ArrayList<Story>();
        for (int i = 0; i < 10; i++)
            storiesNguNgon.add(new Story(R.drawable.ic_ngungon, "Story " + i, "Story " + i));
    }

    private void addArrListStoryLove() {
        storiesLove = new ArrayList<Story>();for (int i = 0; i < 10; i++)
            storiesLove.add(new Story(R.drawable.ic_tinhyeu, "Story " + i, "Story " + i));
    }

    private void addArrListStoryTieuLam() {
        storiesTieuLam = new ArrayList<Story>();for (int i = 0; i < 10; i++)
            storiesTieuLam.add(new Story(R.drawable.ic_tieulam, "Story " + i, "Story " + i));
    }

    private void addArrListStoryShort() {
        storiesShort = new ArrayList<Story>();for (int i = 0; i < 10; i++)
            storiesShort.add(new Story(R.drawable.ic_ngan, "Story " + i, "Story " + i));
    }

    private void addArrListStoryCongSo() {
        storiesCongSo = new ArrayList<Story>();for (int i = 0; i < 10; i++)
            storiesCongSo.add(new Story(R.drawable.ic_congso, "Story " + i, "Story " + i));
    }

    private void addArrListStoryTamQuoc() {
        storiesTamQuoc = new ArrayList<Story>();for (int i = 0; i < 10; i++)
            storiesTamQuoc.add(new Story(R.drawable.ic_tamquoc, "Story " + i, "Story " + i));
    }

    private void addArrListStoryOther() {
        storiesOther = new ArrayList<Story>();for (int i = 0; i < 10; i++)
            storiesOther.add(new Story(R.drawable.ic_truyen, "Story " + i, "Story " + i));
    }

    private void addArrListStoryFolk() {
        storiesFolk = new ArrayList<Story>();
        storiesFolk.add(new Story(R.drawable.ic_dangian, "Đầu to bằng cái bồ", "Chuyện kể rằng lúc Quỳnh còn nhỏ, mới bảy tám tuổi, Quỳnh đã tỏ ra thông minh đỉnh ngộ nhưng cũng là một đứa trẻ chúa nghịch. Hồi ấy bọn trẻ thường chơi trò xước xách, lấy tàu chuối làm cờ, lá sen làm lọng. Trong trò chơi, Quỳnh bao giờ cũng lấn lướt.\n" +
                "\n" +
                "Một đêm mùa thu, trăng tháng tám sáng vằng vặc, đang chơi với đám trẻ ở sân nhà, Quỳnh bảo:\n" +
                "\n" +
                "– Chúng bay làm kiệu cho tao ngồi, rồi tao đưa đi xem một người mà cái đầu to bằng cái bồ!\n" +
                "\n" +
                "Lũ trẻ tưởng thật, liền tranh nhau làm kiệu rước Quỳnh đi vòng vòng quanh sân, mệt thở muốn đứt hơi. Xong, chúng nhất định bắt Quỳnh phải giữ lời hứa. Lúc ấy trăng đã mờ, Quỳnh bảo:\n" +
                "\n" +
                "– Tụi bây đứng đợi cả ở đây, tôi đi đốt lửa soi cho mà xem!\n" +
                "\n" +
                "Bọn trẻ nhỏ hơi sợ, không dám ở lại, chỉ những đứa lớn hơn, bạo dạn đứng chờ. Quỳnh lấy lửa thắp đèn xong đâu đấy, rồi thò đầu che ngọn đèn, bảo:\n" +
                "\n" +
                "– Kìa, trông trên vách kìa. Ông to đầu đã ra đấy!\n" +
                "\n" +
                "Anh nào cũng nhìn nhớn nhơ nhớn nhác, thấy bóng đầu Quỳnh ở vách to bằng cái bồ thật. Lũ trẻ biết Quỳnh xỏ, quay ra bắt Quỳnh làm kiệu đền, Quỳnh chạy vào buồng đóng cửa lại, kêu ầm lên. Ông bố tưởng là trẻ đánh, cầm roi chạy ra, lũ trẻ chạy tán loạn."));
        storiesFolk.add(new Story(R.drawable.ic_dangian, "Nàng tiên cóc", "Ngày xưa, có hai vợ chồng nông dân hiếm hoi, cầu Trời khấn Phật mãi người vợ mới có thai, nhưng đến khi sinh ra, không phải là người mà lại là một con cóc.\n" +
                "\n" +
                "Con cóc lớn lên, biết nói tiếng người, song hình thù sần sùi, xấu xí, khiến cha mẹ nó lấy làm buồn phiền, thường than thở với nhau: “Vợ chồng mình già cả, hiếm hoi, tưởng sinh được mụn con nối dòng, trông nom đỡ đần mình, ngờ đâu oan gia nghiệp báo lại sinh ra cóc, còn trông mong gì nữa”!\n" +
                "\n" +
                "Cóc nghe thấy thế, khuyên cha mẹ đừng lo. Rồi ngay hôm sau cóc nhảy đi coi ruộng cho cha mẹ, và từ khi nó trông nom đồng áng thì chẳng có ai lấy trộm lúa ruộng nhà nó như trước nữa.\n" +
                "\n" +
                "Một hôm, có mấy thư sinh đi qua ruộng nó, dẫm lên lúa, bỗng nghe có tiếng lanh lảnh như giọng con gái bảo rằng: “Xin các cậu đi cho có ý tứ kẻo làm nát lúa nhà em”. Lũ thư sinh nhìn vào ruộng lúa, chẳng thấy ai, chỉ thấy một con cóc đang ngồi đó. Tiếng nói dịu ngọt làm cho một anh trong bọn đâm ra có cảm tình. Chàng thư sinh này bấy lâu đọc sách đạo thần tiên, tin tưởng có sự mầu nhiệm ở đời, nên về nhà nói với cha mẹ xin hỏi cóc làm vợ.\n" +
                "\n" +
                "Ban đầu cha mẹ thư sinh tưởng con mình hóa dại, song anh ta cứ một mực đòi lấy cóc làm vợ cho kỳ được, nếu không thì thề quyết chẳng lấy ai. Người cha bèn kiếm cớ từ khước, bảo chỉ có một mình anh ta là con trai, cưới cóc về có sinh ra được con cái để nối dòng không? Thư sinh tin là sẽ có sự nhiệm màu xảy đến trong ngày cưới cóc về, Tiên Phật sẽ giúp cho cóc thành người có đức hạnh, nhan sắc hơn đời. Thấy con đã nhất quyết như vậy, cha mẹ anh ta cũng đành phải chiều theo, đem trầu cau đi hỏi cóc.\n" +
                "\n" +
                "Đến ngày cưới, bên nhà trai mang đủ lễ vật, đồ nữ trang, quần áo cho cô dâu như người thường, chàng rể hy vọng Tiên Phật hóa phép cho cóc thành một cô gái xinh tươi như chàng vẫn mộng tưởng. Cả hai họ cũng trông mong như vậy, nhưng đến khi rước dâu, mọi người phải tức cười và xấu hổ vì đưa đón một con cóc nhảy về nhà chồng.\n" +
                "\n" +
                "Cha mẹ chồng vừa rầu, phiền cho con trai, vừa chua xót vì con dâu cóc, liền cấp ruộng cho đôi lứa đi ở riêng. Thư sinh cũng buồn lòng, cặm cụi học hành, nghiên cứu các khoa học thần bí, hy vọng gỡ rối cho gia đình, nhất là đối với cha mẹ già đang khát khao có cháu bế. Cóc thì siêng năng công việc ở nhà, thức khuya dậy sớm khuyên chồng chăm chỉ bút nghiên.\n" +
                "\n" +
                "Ngày ngày anh ta đi học về thì đã thấy cơm nước sẵn sàng, nhà cửa sạch sẽ ngăn nắp, mới nghĩ bụng rằng trong lúc vắng mình, chắc vợ trút lốt cóc thành người, chứ một con cóc thì làm sao lo việc nội trợ khéo léo được thế kia? Mấy bận anh ta thử rình, ra đi rồi thình lình trở về bất ngờ, hy vọng bắt gặp vợ là một cô gái xinh đẹp, song chỉ thấy một con cóc sần sùi ở nhà. Anh van nài cóc hóa thành người đẹp cho mình được sung sướng, nhưng cóc vẫn thản nhiên không tỏ vẻ gì cả.\n" +
                "\n" +
                "Một tối, anh cho cóc hay tin mình được bổ đi dạy ở trường tỉnh, ngỏ thật rằng mình không thể đưa vợ đi theo nếu vợ vẫn giữ lốt cóc. Từ ngày cưới về anh ta đã chịu biết bao lời chế diễu của hàng xóm, bè bạn. Hơn nữa, cha mẹ vẫn thúc dục anh lấy thêm vợ khác để có con nối nghiệp tông đường. Cóc lặng yên nghe chồng than thở, khuyên chồng chớ nên quá buồn phiền, và xin phép hôm sau về nhà thăm cha mẹ.\n" +
                "\n" +
                "Sáng ngày, cóc đi theo chồng, được một quãng thì nhảy vào một cái bụi bên đường. Thư sinh dừng bước lại thì thấy ở bụi cây đi ra một cô gái xinh đẹp lạ lùng, quá sức ước mong của anh bấy lâu. Anh sung sướng ngẩn ngơ nhìn người vợ đẹp lại gần, say đắm ngắm nghía vợ từ đầu đến chân rồi thiết tha xin vợ từ đây cứ giữ hình người. Biết là vợ đã trút lốt cóc ra trong bụi, anh ta kiếm cớ đi lùi lại sau rồi chạy lẻn đến bụi tìm lốt cóc mà dấu vào mình.\n" +
                "\n" +
                "Đến nhà, cha mẹ thư sinh mừng rỡ thấy con dâu cóc đã hóa ra người xinh đẹp, dịu dàng. Anh chồng hân hoan thừa lúc mọi người không để ý đến, đem lốt da cóc bỏ vào bếp lửa cho tiêu tan. Hai vợ chồng ở lại nhà cha mẹ cả đôi bên luôn mấy ngày, vui vẻ tiệc tùng liên tiếp rồi mới trở về nhà.\n" +
                "\n" +
                "Trên đường về vợ kiếm cớ vào bụi cây để tìm lại lốt cũ, không thấy, chồng mới cho hay là mình đã lấy đốt đi rồi. Vợ đành phải giữ nguyên hình người để về với chồng.\n" +
                "\n" +
                "Hai vợ chồng ăn ở với nhau đằm thắm vui vẻ, vợ sinh được nhiều con cái, chồng học thi đỗ cao làm nên chức lớn, sống một đời sung sướng."));
        for (int i = 0; i < 10; i++)
            storiesFolk.add(new Story(R.drawable.ic_dangian, "Story " + i, "Story " + i));
    }

    public static StoryManager getInstance() {
        if (instance == null) {
            instance = new StoryManager();
        }
        return instance;
    }

    private void addArrListStoryFunny() {
        storiesFunny = new ArrayList<Story>();
        storiesFunny.add(new Story(R.drawable.ic_chonau2, "Học sinh thời nay!!!", "- Thầy nghĩ là ở đây không thích hợp để ngủ. Em có thể về nhà nằm ngủ được đấy!\n" +
                "\n" +
                "- Thưa thầy không sao đâu ạ, chỉ mong thầy và các bạn nói nhỏ một chút!\n" +
                "\n" +
                "- !!!!!"));
        storiesFunny.add(new Story(R.drawable.ic_chonau2, "Thằng thứ tư đâu", "- Một nhóm học sinh đi chung trên một chiếc xe máy, đang chạy xe trên đường thì bị cảnh sát thổi, cả nhóm dừng lại.\n" +
                "\n" +
                "- Cảnh sát hỏi:\"Tại sao mấy đứa dám tống ba mà lại không đội nón bảo hiểm vậy hả? Có biết như vậy là vi phạm luật giao thông hay ko?\" \n" +
                "\n" +
                "- Cả nhóm hốt hoảng quay lại nhìn phía sau và hét lên:\"Chết cha còn thằng thứ tư đâu mất tiêu rồi!!!\"\n" +
                "\n" +
                "- Cảnh sát: !!!???"));
        storiesFunny.add(new Story(R.drawable.ic_chonau2, "Liều mình", "- Một học sinh đi chơi về tuyên bố với cả phòng:\n" +
                "\n" +
                "Cuối cùng rồi cũng có người con gái dám liều mình vì tao. Cả phòng nhao nhao:\n" +
                "\n" +
                "- Ai vậy mày, nhỏ nào nói nghe coi?\n" +
                "\n" +
                "- Nhỏ Hồng bên lớp sử chứ ai!\n" +
                "\n" +
                "- Nhỏ nói gì với mày?\n" +
                "\n" +
                "- Nhỏ nói “Yêu ông ư? Tui thà nhảy lầu còn hơn”."));
        storiesFunny.add(new Story(R.drawable.ic_chonau2, "Đến thầy cũng đau tim", "- Thầy giáo : Em hãy cho biết Mặt Trăng xa hơn hay Mặt Trời xa hơn?\n" +
                "- Trò : Mặt trời xa hơn ạ .\n" +
                "- Thầy : Vì sao ?\n" +
                "- Trò : Vì sao của Khởi My ạ\n" +
                "- Thầy : Không, tại sao ?\n" +
                "- Trò : Tại sao của Ưng Hoàng Phúc ạ !\n" +
                "- Thầy : Ko , ý thầy là Why đó .!\n" +
                "- Trò : Why ? À ! Why của DBSK .\n" +
                "- Thầy : Trời ơi ,tôi phải làm thế nào ?\n" +
                "- Trò : Dạ , phải làm thế nào của Wanbi ạ\n" +
                "- Thầy : Trời ơi !!!\n" +
                "- Trò : Trời ơi của Lê Cát Trọng lý ạ ..\n" +
                "- Thầy : Tôi đau tim quá >.<'\n" +
                "- Trò : Đau tim của Lâm Chấn Huy ạ\n" +
                "- Thầy : Ra Khỏi Lớp\n" +
                "- Trò : ốồô , bài này mới ...=))"));
        storiesFunny.add(new Story(R.drawable.ic_chonau2, "Phỏng vấn", "- Trong 1 cuộc thi vấn đáp:\n" +
                "GV: Trên 1 máy bay có 500 cục gạch, rơi 1 cục hỏi còn mấy cục?\n" +
                "HS: Dễ quá! 499 cục\n" +
                ".\n" +
                ".\n" +
                "...\n" +
                "GV: Làm thế nào trong 3 bước bỏ đc con voi vào tủ lạnh?\n" +
                "HS: B1: mở tủ lanh B2: nhét con voi vào\n" +
                "\n" +
                "B3:đóng tủ lạnh\n" +
                ".\n" +
                ".\n" +
                "GV: Thế trong 4 bước, làm sao để nhé con hươu cao cổ vào tủ lạnh?\n" +
                "HS: B1:mở tủ lạnh B2: lôi con voi ra\n" +
                "B3:nhét con hươu vào B4:đóng tủ lạnh\n" +
                ".\n" +
                ".\n" +
                "GV: Tốt! thế trong cuộc họp đầy đủ các loại muôn thú trên thiên đình thì sao vẫn thiếu 1 con?\n" +
                "HS: Thiếu con hươu cao cổ đang bị nhốt\n" +
                "trong tủ lạnh\n" +
                ".\n" +
                ".\n" +
                "GV: Thế sao trong 1 con sông đầy cá sấu mà bà lão đi qua vẫn ko bị ăn thịt?\n" +
                "HS: Vì cá sấu đi họp trên thiên đình hết rồi.\n" +
                ".\n" +
                ".\n" +
                "GV: Một bà lão đi qua cầu, tự dưng bà ta lăn ra chết. Hỏi tại sao bà ta chết?\n" +
                "HS: Bà ta bị đột quỵ thì phải...\n" +
                ".\n" +
                ".\n" +
                "GV: Sai! bà ta bị cục gạch trên máy bay rơi trúng đầu chết." +
                " Cậu bị loại! Người tiếp theo."));

    }

    public ArrayList<Story> getStoriesFunny() {
        return storiesFunny;
    }

    public ArrayList<Story> getStoriesFolk() {
        return storiesFolk;
    }

    public int getSize() {
        return stories.size();
    }

    public void setStories(ArrayList<Story> stories) {
        this.stories = stories;
    }

    public Story getStory(int position) {
        return stories.get(position);
    }

    public ArrayList<Story> getStoriesCoTich() {
        return storiesCoTich;
    }

    public ArrayList<Story> getStoriesNguNgon() {
        return storiesNguNgon;
    }

    public ArrayList<Story> getStoriesLove() {
        return storiesLove;
    }

    public ArrayList<Story> getStoriesTieuLam() {
        return storiesTieuLam;
    }

    public ArrayList<Story> getStoriesShort() {
        return storiesShort;
    }

    public ArrayList<Story> getStoriesCongSo() {
        return storiesCongSo;
    }

    public ArrayList<Story> getStoriesTamQuoc() {
        return storiesTamQuoc;
    }

    public ArrayList<Story> getStoriesOther() {
        return storiesOther;
    }
}
