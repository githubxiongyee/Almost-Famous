// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LSMessage.proto

package LockstepProto;

public interface CommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LockstepProto.Command)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 controlerID = 1;</code>
   */
  int getControlerID();

  /**
   * <code>int32 inputCode = 2;</code>
   */
  int getInputCode();

  /**
   * <code>repeated .LockstepProto.DefaultData defaultData = 3;</code>
   */
  java.util.List<DefaultData>
      getDefaultDataList();
  /**
   * <code>repeated .LockstepProto.DefaultData defaultData = 3;</code>
   */
  LockstepProto.DefaultData getDefaultData(int index);
  /**
   * <code>repeated .LockstepProto.DefaultData defaultData = 3;</code>
   */
  int getDefaultDataCount();
  /**
   * <code>repeated .LockstepProto.DefaultData defaultData = 3;</code>
   */
  java.util.List<? extends DefaultDataOrBuilder>
      getDefaultDataOrBuilderList();
  /**
   * <code>repeated .LockstepProto.DefaultData defaultData = 3;</code>
   */
  LockstepProto.DefaultDataOrBuilder getDefaultDataOrBuilder(
          int index);

  /**
   * <code>repeated .LockstepProto.Coordinate coordinate = 4;</code>
   */
  java.util.List<Coordinate>
      getCoordinateList();
  /**
   * <code>repeated .LockstepProto.Coordinate coordinate = 4;</code>
   */
  LockstepProto.Coordinate getCoordinate(int index);
  /**
   * <code>repeated .LockstepProto.Coordinate coordinate = 4;</code>
   */
  int getCoordinateCount();
  /**
   * <code>repeated .LockstepProto.Coordinate coordinate = 4;</code>
   */
  java.util.List<? extends LockstepProto.CoordinateOrBuilder>
      getCoordinateOrBuilderList();
  /**
   * <code>repeated .LockstepProto.Coordinate coordinate = 4;</code>
   */
  LockstepProto.CoordinateOrBuilder getCoordinateOrBuilder(
          int index);

  /**
   * <code>repeated .LockstepProto.Selection selection = 5;</code>
   */
  java.util.List<Selection>
      getSelectionList();
  /**
   * <code>repeated .LockstepProto.Selection selection = 5;</code>
   */
  LockstepProto.Selection getSelection(int index);
  /**
   * <code>repeated .LockstepProto.Selection selection = 5;</code>
   */
  int getSelectionCount();
  /**
   * <code>repeated .LockstepProto.Selection selection = 5;</code>
   */
  java.util.List<? extends SelectionOrBuilder>
      getSelectionOrBuilderList();
  /**
   * <code>repeated .LockstepProto.Selection selection = 5;</code>
   */
  LockstepProto.SelectionOrBuilder getSelectionOrBuilder(
          int index);

  /**
   * <code>repeated .LockstepProto.Vector2d vector2d = 6;</code>
   */
  java.util.List<LockstepProto.Vector2d>
      getVector2DList();
  /**
   * <code>repeated .LockstepProto.Vector2d vector2d = 6;</code>
   */
  LockstepProto.Vector2d getVector2D(int index);
  /**
   * <code>repeated .LockstepProto.Vector2d vector2d = 6;</code>
   */
  int getVector2DCount();
  /**
   * <code>repeated .LockstepProto.Vector2d vector2d = 6;</code>
   */
  java.util.List<? extends Vector2dOrBuilder>
      getVector2DOrBuilderList();
  /**
   * <code>repeated .LockstepProto.Vector2d vector2d = 6;</code>
   */
  LockstepProto.Vector2dOrBuilder getVector2DOrBuilder(
          int index);

  /**
   * <code>repeated .LockstepProto.Vector3d vector3d = 7;</code>
   */
  java.util.List<Vector3d>
      getVector3DList();
  /**
   * <code>repeated .LockstepProto.Vector3d vector3d = 7;</code>
   */
  LockstepProto.Vector3d getVector3D(int index);
  /**
   * <code>repeated .LockstepProto.Vector3d vector3d = 7;</code>
   */
  int getVector3DCount();
  /**
   * <code>repeated .LockstepProto.Vector3d vector3d = 7;</code>
   */
  java.util.List<? extends Vector3dOrBuilder>
      getVector3DOrBuilderList();
  /**
   * <code>repeated .LockstepProto.Vector3d vector3d = 7;</code>
   */
  LockstepProto.Vector3dOrBuilder getVector3DOrBuilder(
          int index);
}
