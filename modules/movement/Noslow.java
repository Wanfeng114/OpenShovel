恭喜你啊 兄弟 被欣欣哥恭喜到了 现在你可以在起床跑吃跑喝了
if (packet instanceof CPacketPlayerTryUseItem) {
                    setStrafeAndForward(0.2f);
                    event.setCancelled(true);
                    PacketUtils.sendPacketNoEvent(packet);
                    mc.getConnection().sendPacket(new CPacketChatMessage("/lizi open"));
                }
                if (packet instanceof SPacketOpenWindow) {
                    if (((SPacketOpenWindow) packet).getWindowTitle().getUnformattedText().contains("特效")) {
                        event.setCancelled(true);
                        setStrafeAndForward(1f);
                        mc.getConnection().sendPacket(new CPacketCloseWindow(((SPacketOpenWindow) packet).getWindowId()));
                    }
                }