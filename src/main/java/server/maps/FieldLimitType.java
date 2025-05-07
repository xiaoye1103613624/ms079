/*
 This file is part of the OdinMS Maple Story Server
 Copyright (C) 2008 ~ 2010 Patrick Huy <patrick.huy@frz.cc> 
 Matthias Butz <matze@odinms.de>
 Jan Christian Meyer <vimes@odinms.de>

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU Affero General Public License version 3
 as published by the Free Software Foundation. You may not use, modify
 or distribute this program under any other version of the
 GNU Affero General Public License.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Affero General Public License for more details.

 You should have received a copy of the GNU Affero General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package server.maps;
/**
 * 字段类型设置
 * @author 陈耀
 */
public enum FieldLimitType {
    /**
     * 跳跃
     */
    Jump(0x1),
    /**
     * 移动技能
     */
    MovementSkills(0x2),
    /**
     * 召唤魔法
     */
    SummoningBag(0x04),
    /**
     * 神秘的门
     */
    MysticDoor(0x08),
    /**
     * 频道切换
     */
    ChannelSwitch(0x10),
    /**
     *
     */
    RegularExpLoss(0x20),
    /**
     *
     */
    VipRock(0x40),
    /**
     *
     */
    Minigames(0x80),
    /**
     * APQ和一些任务地图有这个
     */
    NoClue1(0x100),
    /**
     *
     */
    Mount(0x200),
    /**
     * 使用药水 or 0x40000
     */
    PotionUse(0x400),
    /**
     * 事件
     */
    Event(0x2000),
    /**
     * 宠物
     */
    Pet(0x8000),
    /**
     * 事件2
     */
    Event2(0x10000),
    /**
     * NoClue7(0x40000)  Seems to .. disable Rush if 0x2 is set
     */
    DropDown(0x20000),
    ;
    private final int i;

    private FieldLimitType(int i) {
        this.i = i;
    }

    public final int getValue() {
        return i;
    }

    public final boolean check(int fieldlimit) {
        return (fieldlimit & i) == i;
    }
}
