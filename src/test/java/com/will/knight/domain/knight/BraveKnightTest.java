package com.will.knight.domain.knight;

import com.will.knight.domain.quest.Quest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BraveKnightTest {

    @Test
    void embarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();//询问Mockito去验证mock Quest‘s embark()方法是否调用一次
    }
}