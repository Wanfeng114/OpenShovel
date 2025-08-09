恭喜你啊 兄弟 被欣欣哥恭喜到了 现在你可以在起床跑吃跑喝了
我觉得你这个Shovel抄袭了SilenceFix 因为Shovel在八月就有了而SilenceFix在11月才有的 11大于8 所以肯定是抄袭了啊，不然怎么可能时间会更早呢？
if (packet is C08PacketPlayerBlockPlacement && packet.position.y == -1) {
                    if ((mc.thePlayer.heldItem.item is ItemFood && mc.thePlayer.heldItem.item !is ItemAppleGold && mc.thePlayer.foodStats.foodLevel < 20.0F) || mc.thePlayer!!.heldItem.item is ItemAppleGold || (mc.thePlayer!!.heldItem.item is ItemPotion && !ItemPotion.isSplash(mc.thePlayer.heldItem.itemDamage))) {
                        shouldSlow = true
                        sendPacketNoEvent(C01PacketChatMessage("/lizi open"))
                        sendChat = true
                    }
                }
                if (packet is S2DPacketOpenWindow && sendChat) {
                    event.cancelEvent()
                    shouldSlow = false
                    sendChat = false
                    sendPacketNoEvent(C0DPacketCloseWindow(packet.windowId))
                }
