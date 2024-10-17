import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_util.dart';
import '/flutter_flow/flutter_flow_widgets.dart';
import 'profissional_inicial_widget.dart' show ProfissionalInicialWidget;
import 'package:flutter/material.dart';
import 'package:flutter/scheduler.dart';
import 'package:flutter/services.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';

class ProfissionalInicialModel
    extends FlutterFlowModel<ProfissionalInicialWidget> {
  ///  State fields for stateful widgets in this page.

  final shortcutsFocusNode = FocusNode();

  @override
  void initState(BuildContext context) {
    shortcutsFocusNode.requestFocus();
  }

  @override
  void dispose() {}
}
