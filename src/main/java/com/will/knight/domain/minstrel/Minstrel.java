package com.will.knight.domain.minstrel;

import lombok.Data;

@Data
public class Minstrel {
    /**
     * 吟游诗人歌颂骑士的事迹，
     * 但是Minstrel类的对象本身不应该由Knight来管理
     *
     * 应该将Minstrel声明为一个切面*/
    void singBeforeQuest() {
        System.out.println("Fa la la; The knight is so brave!");
    }

    void singAfterQuest() {
        System.out.println("Tee hee hel The brave knight embark on a quest");
    }
}
