package com.springinaction.knights;

import com.springinaction.quests.Quest;
import com.springinaction.quests.QuestException;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest; // Внедрение сценария подвига
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
