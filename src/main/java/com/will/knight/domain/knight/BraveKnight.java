package com.will.knight.domain.knight;

import com.will.knight.domain.quest.Quest;
import lombok.Data;

@Data
public class BraveKnight implements Knight{
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
