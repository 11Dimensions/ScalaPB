// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor



/** @param allowAlias
  *   Set this option to true to allow mapping different tag names to the same
  *   value.
  * @param deprecated
  *   Is this enum deprecated?
  *   Depending on the target platform, this can emit Deprecated annotations
  *   for the enum, or it will be completely ignored; in the very least, this
  *   is a formalization for deprecating enums.
  * @param uninterpretedOption
  *   The parser stores options it doesn't recognize here. See above.
  */
@SerialVersionUID(0L)
final case class EnumOptions(
    allowAlias: scala.Option[Boolean] = None,
    deprecated: scala.Option[Boolean] = None,
    uninterpretedOption: scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption] = Nil
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EnumOptions] with com.trueaccord.lenses.Updatable[EnumOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (allowAlias.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, allowAlias.get) }
      if (deprecated.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(3, deprecated.get) }
      uninterpretedOption.foreach(uninterpretedOption => __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(uninterpretedOption.serializedSize) + uninterpretedOption.serializedSize)
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      allowAlias.foreach { __v =>
        _output__.writeBool(2, __v)
      };
      deprecated.foreach { __v =>
        _output__.writeBool(3, __v)
      };
      uninterpretedOption.foreach { __v =>
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.EnumOptions = {
      var __allowAlias = this.allowAlias
      var __deprecated = this.deprecated
      val __uninterpretedOption = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.UninterpretedOption] ++= this.uninterpretedOption)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 16 =>
            __allowAlias = Some(_input__.readBool())
          case 24 =>
            __deprecated = Some(_input__.readBool())
          case 7994 =>
            __uninterpretedOption += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.UninterpretedOption.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.EnumOptions(
          allowAlias = __allowAlias,
          deprecated = __deprecated,
          uninterpretedOption = __uninterpretedOption.result()
      )
    }
    def getAllowAlias: Boolean = allowAlias.getOrElse(false)
    def clearAllowAlias: EnumOptions = copy(allowAlias = None)
    def withAllowAlias(__v: Boolean): EnumOptions = copy(allowAlias = Some(__v))
    def getDeprecated: Boolean = deprecated.getOrElse(false)
    def clearDeprecated: EnumOptions = copy(deprecated = None)
    def withDeprecated(__v: Boolean): EnumOptions = copy(deprecated = Some(__v))
    def clearUninterpretedOption = copy(uninterpretedOption = scala.collection.Seq.empty)
    def addUninterpretedOption(__vs: com.google.protobuf.descriptor.UninterpretedOption*): EnumOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: TraversableOnce[com.google.protobuf.descriptor.UninterpretedOption]): EnumOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]): EnumOptions = copy(uninterpretedOption = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      __fieldNumber match {
        case 2 => allowAlias.orNull
        case 3 => deprecated.orNull
        case 999 => uninterpretedOption
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      __field.number match {
        case 2 => allowAlias.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => deprecated.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 999 => _root_.scalapb.descriptors.PRepeated(uninterpretedOption.map(_.toPMessage).toVector)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.EnumOptions
}

object EnumOptions extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumOptions] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumOptions] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.EnumOptions = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.descriptor.EnumOptions(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.EnumOptions] = _root_.scalapb.descriptors.Reads(_ match {
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.EnumOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(999).get).map(_.as[scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]]).getOrElse(Nil)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  })
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(13)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(13)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __fieldNumber match {
      case 999 => __out = com.google.protobuf.descriptor.UninterpretedOption
    }
  __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.EnumOptions(
  )
  implicit class EnumOptionsLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumOptions]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.EnumOptions](_l) {
    def allowAlias: _root_.com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getAllowAlias)((c_, f_) => c_.copy(allowAlias = Some(f_)))
    def optionalAllowAlias: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.allowAlias)((c_, f_) => c_.copy(allowAlias = f_))
    def deprecated: _root_.com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getDeprecated)((c_, f_) => c_.copy(deprecated = Some(f_)))
    def optionalDeprecated: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.deprecated)((c_, f_) => c_.copy(deprecated = f_))
    def uninterpretedOption: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val ALLOW_ALIAS_FIELD_NUMBER = 2
  final val DEPRECATED_FIELD_NUMBER = 3
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
}
