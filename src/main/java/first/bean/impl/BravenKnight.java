package first.bean.impl;

import first.bean.Knight;
import first.bean.Quest;

public class BravenKnight implements Knight {
    private Quest quest;

    public BravenKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        System.out.println("BravenKnight embarkOnQuest start...");
        quest.embark();
        System.out.println("BravenKnight embarkOnQuest end...");
    }
}
