// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

import scala.collection.JavaConverters._

/** Describes a method of a service.
  *
  * @param inputType
  *   Input and output type names.  These are resolved in the same way as
  *   FieldDescriptorProto.type_name, but must refer to a message type.
  * @param clientStreaming
  *   Identifies if client streams multiple client messages
  * @param serverStreaming
  *   Identifies if server streams multiple server messages
  */
@SerialVersionUID(0L)
final case class MethodDescriptorProto(
    name: scala.Option[String] = None,
    inputType: scala.Option[String] = None,
    outputType: scala.Option[String] = None,
    options: scala.Option[com.google.protobuf.descriptor.MethodOptions] = None,
    clientStreaming: scala.Option[Boolean] = None,
    serverStreaming: scala.Option[Boolean] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[MethodDescriptorProto] with com.trueaccord.lenses.Updatable[MethodDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, name.get) }
      if (inputType.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, inputType.get) }
      if (outputType.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, outputType.get) }
      if (options.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.get.serializedSize) + options.get.serializedSize }
      if (clientStreaming.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(5, clientStreaming.get) }
      if (serverStreaming.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(6, serverStreaming.get) }
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
      name.foreach { __v =>
        _output__.writeString(1, __v)
      };
      inputType.foreach { __v =>
        _output__.writeString(2, __v)
      };
      outputType.foreach { __v =>
        _output__.writeString(3, __v)
      };
      options.foreach { __v =>
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      clientStreaming.foreach { __v =>
        _output__.writeBool(5, __v)
      };
      serverStreaming.foreach { __v =>
        _output__.writeBool(6, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.MethodDescriptorProto = {
      var __name = this.name
      var __inputType = this.inputType
      var __outputType = this.outputType
      var __options = this.options
      var __clientStreaming = this.clientStreaming
      var __serverStreaming = this.serverStreaming
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Some(_input__.readString())
          case 18 =>
            __inputType = Some(_input__.readString())
          case 26 =>
            __outputType = Some(_input__.readString())
          case 34 =>
            __options = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.MethodOptions.defaultInstance)))
          case 40 =>
            __clientStreaming = Some(_input__.readBool())
          case 48 =>
            __serverStreaming = Some(_input__.readBool())
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.MethodDescriptorProto(
          name = __name,
          inputType = __inputType,
          outputType = __outputType,
          options = __options,
          clientStreaming = __clientStreaming,
          serverStreaming = __serverStreaming
      )
    }
    def getName: String = name.getOrElse("")
    def clearName: MethodDescriptorProto = copy(name = None)
    def withName(__v: String): MethodDescriptorProto = copy(name = Some(__v))
    def getInputType: String = inputType.getOrElse("")
    def clearInputType: MethodDescriptorProto = copy(inputType = None)
    def withInputType(__v: String): MethodDescriptorProto = copy(inputType = Some(__v))
    def getOutputType: String = outputType.getOrElse("")
    def clearOutputType: MethodDescriptorProto = copy(outputType = None)
    def withOutputType(__v: String): MethodDescriptorProto = copy(outputType = Some(__v))
    def getOptions: com.google.protobuf.descriptor.MethodOptions = options.getOrElse(com.google.protobuf.descriptor.MethodOptions.defaultInstance)
    def clearOptions: MethodDescriptorProto = copy(options = None)
    def withOptions(__v: com.google.protobuf.descriptor.MethodOptions): MethodDescriptorProto = copy(options = Some(__v))
    def getClientStreaming: Boolean = clientStreaming.getOrElse(false)
    def clearClientStreaming: MethodDescriptorProto = copy(clientStreaming = None)
    def withClientStreaming(__v: Boolean): MethodDescriptorProto = copy(clientStreaming = Some(__v))
    def getServerStreaming: Boolean = serverStreaming.getOrElse(false)
    def clearServerStreaming: MethodDescriptorProto = copy(serverStreaming = None)
    def withServerStreaming(__v: Boolean): MethodDescriptorProto = copy(serverStreaming = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      __fieldNumber match {
        case 1 => name.orNull
        case 2 => inputType.orNull
        case 3 => outputType.orNull
        case 4 => options.orNull
        case 5 => clientStreaming.orNull
        case 6 => serverStreaming.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      __field.number match {
        case 1 => name.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => inputType.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => outputType.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => clientStreaming.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => serverStreaming.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.MethodDescriptorProto
}

object MethodDescriptorProto extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodDescriptorProto] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MethodDescriptorProto, com.google.protobuf.DescriptorProtos.MethodDescriptorProto] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodDescriptorProto] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MethodDescriptorProto, com.google.protobuf.DescriptorProtos.MethodDescriptorProto] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.MethodDescriptorProto): com.google.protobuf.DescriptorProtos.MethodDescriptorProto = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.MethodDescriptorProto.newBuilder
    scalaPbSource.name.foreach(javaPbOut.setName)
    scalaPbSource.inputType.foreach(javaPbOut.setInputType)
    scalaPbSource.outputType.foreach(javaPbOut.setOutputType)
    scalaPbSource.options.map(com.google.protobuf.descriptor.MethodOptions.toJavaProto(_)).foreach(javaPbOut.setOptions)
    scalaPbSource.clientStreaming.foreach(javaPbOut.setClientStreaming)
    scalaPbSource.serverStreaming.foreach(javaPbOut.setServerStreaming)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.MethodDescriptorProto): com.google.protobuf.descriptor.MethodDescriptorProto = com.google.protobuf.descriptor.MethodDescriptorProto(
    name = if (javaPbSource.hasName) Some(javaPbSource.getName) else None,
    inputType = if (javaPbSource.hasInputType) Some(javaPbSource.getInputType) else None,
    outputType = if (javaPbSource.hasOutputType) Some(javaPbSource.getOutputType) else None,
    options = if (javaPbSource.hasOptions) Some(com.google.protobuf.descriptor.MethodOptions.fromJavaProto(javaPbSource.getOptions)) else None,
    clientStreaming = if (javaPbSource.hasClientStreaming) Some(javaPbSource.getClientStreaming.booleanValue) else None,
    serverStreaming = if (javaPbSource.hasServerStreaming) Some(javaPbSource.getServerStreaming.booleanValue) else None
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.MethodDescriptorProto = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.descriptor.MethodDescriptorProto(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[com.google.protobuf.descriptor.MethodOptions]],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[Boolean]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.MethodDescriptorProto] = _root_.scalapb.descriptors.Reads(_ match {
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.MethodDescriptorProto(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[scala.Option[com.google.protobuf.descriptor.MethodOptions]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[scala.Option[Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[scala.Option[Boolean]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  })
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(8)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(8)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __fieldNumber match {
      case 4 => __out = com.google.protobuf.descriptor.MethodOptions
    }
  __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.MethodDescriptorProto(
  )
  implicit class MethodDescriptorProtoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodDescriptorProto]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.MethodDescriptorProto](_l) {
    def name: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getName)((c_, f_) => c_.copy(name = Some(f_)))
    def optionalName: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def inputType: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getInputType)((c_, f_) => c_.copy(inputType = Some(f_)))
    def optionalInputType: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.inputType)((c_, f_) => c_.copy(inputType = f_))
    def outputType: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getOutputType)((c_, f_) => c_.copy(outputType = Some(f_)))
    def optionalOutputType: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.outputType)((c_, f_) => c_.copy(outputType = f_))
    def options: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Some(f_)))
    def optionalOptions: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.MethodOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def clientStreaming: _root_.com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getClientStreaming)((c_, f_) => c_.copy(clientStreaming = Some(f_)))
    def optionalClientStreaming: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.clientStreaming)((c_, f_) => c_.copy(clientStreaming = f_))
    def serverStreaming: _root_.com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getServerStreaming)((c_, f_) => c_.copy(serverStreaming = Some(f_)))
    def optionalServerStreaming: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.serverStreaming)((c_, f_) => c_.copy(serverStreaming = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val INPUT_TYPE_FIELD_NUMBER = 2
  final val OUTPUT_TYPE_FIELD_NUMBER = 3
  final val OPTIONS_FIELD_NUMBER = 4
  final val CLIENT_STREAMING_FIELD_NUMBER = 5
  final val SERVER_STREAMING_FIELD_NUMBER = 6
}
