import 'package:flutter/material.dart';
import '/backend/api_requests/api_manager.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'flutter_flow/flutter_flow_util.dart';
import 'dart:convert';

class FFAppState extends ChangeNotifier {
  static FFAppState _instance = FFAppState._internal();

  factory FFAppState() {
    return _instance;
  }

  FFAppState._internal();

  static void reset() {
    _instance = FFAppState._internal();
  }

  Future initializePersistedState() async {}

  void update(VoidCallback callback) {
    callback();
    notifyListeners();
  }

  List<dynamic> _ShowPressaoArterial = [];
  List<dynamic> get ShowPressaoArterial => _ShowPressaoArterial;
  set ShowPressaoArterial(List<dynamic> value) {
    _ShowPressaoArterial = value;
  }

  void addToShowPressaoArterial(dynamic value) {
    ShowPressaoArterial.add(value);
  }

  void removeFromShowPressaoArterial(dynamic value) {
    ShowPressaoArterial.remove(value);
  }

  void removeAtIndexFromShowPressaoArterial(int index) {
    ShowPressaoArterial.removeAt(index);
  }

  void updateShowPressaoArterialAtIndex(
    int index,
    dynamic Function(dynamic) updateFn,
  ) {
    ShowPressaoArterial[index] = updateFn(_ShowPressaoArterial[index]);
  }

  void insertAtIndexInShowPressaoArterial(int index, dynamic value) {
    ShowPressaoArterial.insert(index, value);
  }

  List<dynamic> _ShowPacientes = [];
  List<dynamic> get ShowPacientes => _ShowPacientes;
  set ShowPacientes(List<dynamic> value) {
    _ShowPacientes = value;
  }

  void addToShowPacientes(dynamic value) {
    ShowPacientes.add(value);
  }

  void removeFromShowPacientes(dynamic value) {
    ShowPacientes.remove(value);
  }

  void removeAtIndexFromShowPacientes(int index) {
    ShowPacientes.removeAt(index);
  }

  void updateShowPacientesAtIndex(
    int index,
    dynamic Function(dynamic) updateFn,
  ) {
    ShowPacientes[index] = updateFn(_ShowPacientes[index]);
  }

  void insertAtIndexInShowPacientes(int index, dynamic value) {
    ShowPacientes.insert(index, value);
  }

  List<dynamic> _ShowSintomas = [];
  List<dynamic> get ShowSintomas => _ShowSintomas;
  set ShowSintomas(List<dynamic> value) {
    _ShowSintomas = value;
  }

  void addToShowSintomas(dynamic value) {
    ShowSintomas.add(value);
  }

  void removeFromShowSintomas(dynamic value) {
    ShowSintomas.remove(value);
  }

  void removeAtIndexFromShowSintomas(int index) {
    ShowSintomas.removeAt(index);
  }

  void updateShowSintomasAtIndex(
    int index,
    dynamic Function(dynamic) updateFn,
  ) {
    ShowSintomas[index] = updateFn(_ShowSintomas[index]);
  }

  void insertAtIndexInShowSintomas(int index, dynamic value) {
    ShowSintomas.insert(index, value);
  }

  List<dynamic> _ShowConsultas = [];
  List<dynamic> get ShowConsultas => _ShowConsultas;
  set ShowConsultas(List<dynamic> value) {
    _ShowConsultas = value;
  }

  void addToShowConsultas(dynamic value) {
    ShowConsultas.add(value);
  }

  void removeFromShowConsultas(dynamic value) {
    ShowConsultas.remove(value);
  }

  void removeAtIndexFromShowConsultas(int index) {
    ShowConsultas.removeAt(index);
  }

  void updateShowConsultasAtIndex(
    int index,
    dynamic Function(dynamic) updateFn,
  ) {
    ShowConsultas[index] = updateFn(_ShowConsultas[index]);
  }

  void insertAtIndexInShowConsultas(int index, dynamic value) {
    ShowConsultas.insert(index, value);
  }

  List<dynamic> _ShowRemedios = [];
  List<dynamic> get ShowRemedios => _ShowRemedios;
  set ShowRemedios(List<dynamic> value) {
    _ShowRemedios = value;
  }

  void addToShowRemedios(dynamic value) {
    ShowRemedios.add(value);
  }

  void removeFromShowRemedios(dynamic value) {
    ShowRemedios.remove(value);
  }

  void removeAtIndexFromShowRemedios(int index) {
    ShowRemedios.removeAt(index);
  }

  void updateShowRemediosAtIndex(
    int index,
    dynamic Function(dynamic) updateFn,
  ) {
    ShowRemedios[index] = updateFn(_ShowRemedios[index]);
  }

  void insertAtIndexInShowRemedios(int index, dynamic value) {
    ShowRemedios.insert(index, value);
  }

  List<dynamic> _ShowDiabetes = [];
  List<dynamic> get ShowDiabetes => _ShowDiabetes;
  set ShowDiabetes(List<dynamic> value) {
    _ShowDiabetes = value;
  }

  void addToShowDiabetes(dynamic value) {
    ShowDiabetes.add(value);
  }

  void removeFromShowDiabetes(dynamic value) {
    ShowDiabetes.remove(value);
  }

  void removeAtIndexFromShowDiabetes(int index) {
    ShowDiabetes.removeAt(index);
  }

  void updateShowDiabetesAtIndex(
    int index,
    dynamic Function(dynamic) updateFn,
  ) {
    ShowDiabetes[index] = updateFn(_ShowDiabetes[index]);
  }

  void insertAtIndexInShowDiabetes(int index, dynamic value) {
    ShowDiabetes.insert(index, value);
  }
}
