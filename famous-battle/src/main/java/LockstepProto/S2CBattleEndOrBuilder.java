// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NetMessage.proto

package LockstepProto;

public interface S2CBattleEndOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LockstepProto.S2CBattleEnd)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated sint64 winners = 1;</code>
   */
  java.util.List<Long> getWinnersList();
  /**
   * <code>repeated sint64 winners = 1;</code>
   */
  int getWinnersCount();
  /**
   * <code>repeated sint64 winners = 1;</code>
   */
  long getWinners(int index);

  /**
   * <code>repeated sint64 losers = 2;</code>
   */
  java.util.List<Long> getLosersList();
  /**
   * <code>repeated sint64 losers = 2;</code>
   */
  int getLosersCount();
  /**
   * <code>repeated sint64 losers = 2;</code>
   */
  long getLosers(int index);
}
