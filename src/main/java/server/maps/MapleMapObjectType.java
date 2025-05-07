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
 * 地图中对象类型
 *
 * @author 陈耀
 */

public enum MapleMapObjectType {

    NPC,
    /**
     * 怪物
     */
    MONSTER,
    /**
     * 项
     */
    ITEM,
    /**
     * 玩家
     */
    PLAYER,
    /**
     * 传送
     */
    DOOR,
    /**
     * 召唤
     */
    SUMMON,
    /**
     * 商店
     */
    SHOP,
    /**
     * 雾
     */
    MIST,
    /**
     * 反应堆
     */
    REACTOR,
    /**
     * 爱?
     */
    LOVE,
    /**
     * 租赁
     */
    HIRED_MERCHANT;
}
