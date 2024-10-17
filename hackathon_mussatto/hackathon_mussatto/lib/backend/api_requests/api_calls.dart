import 'dart:convert';
import 'dart:typed_data';
import 'package:flutter/foundation.dart';

import '/flutter_flow/flutter_flow_util.dart';
import 'api_manager.dart';

export 'api_manager.dart' show ApiCallResponse;

const _kPrivateApiFunctionName = 'ffPrivateApiCall';

class GETPacientesCall {
  static Future<ApiCallResponse> call() async {
    return ApiManager.instance.makeApiCall(
      callName: 'GET Pacientes',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/pacientes',
      callType: ApiCallType.GET,
      headers: {
        'ngrok-skip-browser-warning': 'true',
      },
      params: {},
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class GETRemediosCall {
  static Future<ApiCallResponse> call() async {
    return ApiManager.instance.makeApiCall(
      callName: 'GET Remedios',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/remedios',
      callType: ApiCallType.GET,
      headers: {
        'ngrok-skip-browser-warning': 'true',
      },
      params: {},
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class POSTPressaoArterialCall {
  static Future<ApiCallResponse> call({
    String? medidaAfericao = '',
  }) async {
    final ffApiRequestBody = '''
{
  "medidaAfericao": "${medidaAfericao}"
}''';
    return ApiManager.instance.makeApiCall(
      callName: 'POST PressaoArterial',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/pressoes-arteriais',
      callType: ApiCallType.POST,
      headers: {
        'Content-Type': 'application/json',
      },
      params: {},
      body: ffApiRequestBody,
      bodyType: BodyType.JSON,
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class POSTPacientesCall {
  static Future<ApiCallResponse> call({
    String? nome = '',
    String? cpf = '',
    String? telefone = '',
    String? numeroCartaoSus = '',
    String? dataNascimento = '',
  }) async {
    final ffApiRequestBody = '''
{
  "nome": "${nome}",
  "cpf": "${cpf}",
  "telefone": "${telefone}",
  "numeroCartaoSus": "${numeroCartaoSus}",
  "dataNascimento": "${dataNascimento}"
}''';
    return ApiManager.instance.makeApiCall(
      callName: 'POST Pacientes',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/pacientes',
      callType: ApiCallType.POST,
      headers: {
        'ngrok-skip-browser-warning': 'true',
        'Content-Type': 'application/json',
      },
      params: {},
      body: ffApiRequestBody,
      bodyType: BodyType.JSON,
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class POSTConsultasCall {
  static Future<ApiCallResponse> call({
    String? dataConsulta = '',
    String? nomePaciente = '',
    String? local = '',
    String? motivo = '',
  }) async {
    final ffApiRequestBody = '''
{
  "dataConsulta": "${dataConsulta}",
  "nomePaciente": "${nomePaciente}",
  "local": "${local}",
  "motivo": "${motivo}"
}''';
    return ApiManager.instance.makeApiCall(
      callName: 'POST Consultas',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/consultas',
      callType: ApiCallType.POST,
      headers: {
        'ngrok-skip-browser-warning': 'true',
        'Content-Type': 'application/json',
      },
      params: {},
      body: ffApiRequestBody,
      bodyType: BodyType.JSON,
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class GETConsultasCall {
  static Future<ApiCallResponse> call() async {
    return ApiManager.instance.makeApiCall(
      callName: 'GET Consultas',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/consultas',
      callType: ApiCallType.GET,
      headers: {
        'ngrok-skip-browser-warning': 'true',
      },
      params: {},
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class POSTSintomasCall {
  static Future<ApiCallResponse> call({
    String? titulo = '',
    String? descricao = '',
  }) async {
    final ffApiRequestBody = '''
{
  "titulo": "${titulo}",
  "descricao": "${descricao}"
}''';
    return ApiManager.instance.makeApiCall(
      callName: 'POST Sintomas',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/sintomas',
      callType: ApiCallType.POST,
      headers: {
        'ngrok-skip-browser-warning': 'true',
        'Content-Type': 'application/json',
      },
      params: {},
      body: ffApiRequestBody,
      bodyType: BodyType.JSON,
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class GETSintomasCall {
  static Future<ApiCallResponse> call() async {
    return ApiManager.instance.makeApiCall(
      callName: 'GET Sintomas',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/sintomas',
      callType: ApiCallType.GET,
      headers: {
        'ngrok-skip-browser-warning': 'true',
      },
      params: {},
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class POSTRemediosCall {
  static Future<ApiCallResponse> call({
    String? nome = '',
    String? intervalo = '',
    String? dosagem = '',
    String? indicacao = '',
    String? dataValidadeReceita = '',
  }) async {
    final ffApiRequestBody = '''
{
  "nome": "${nome}",
  "intervalo": "${intervalo}",
  "dosagem": "${dosagem}",
  "indicacao": "${indicacao}",
  "dataValidadeReceita": "${dataValidadeReceita}"
}''';
    return ApiManager.instance.makeApiCall(
      callName: 'POST Remedios',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/remedios',
      callType: ApiCallType.POST,
      headers: {
        'ngrok-skip-browser-warning': 'true',
        'Content-Type': 'application/json',
      },
      params: {},
      body: ffApiRequestBody,
      bodyType: BodyType.JSON,
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class GETPressaoArterialCall {
  static Future<ApiCallResponse> call() async {
    return ApiManager.instance.makeApiCall(
      callName: 'GET PressaoArterial',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/pressoes-arteriais',
      callType: ApiCallType.GET,
      headers: {
        'ngrok-skip-browser-warning': 'true',
      },
      params: {},
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class POSTDiabetesCall {
  static Future<ApiCallResponse> call({
    String? medidaAfericao = '',
  }) async {
    final ffApiRequestBody = '''
{
  "medidaAfericao": "${medidaAfericao}"
}''';
    return ApiManager.instance.makeApiCall(
      callName: 'POST Diabetes',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/diabetes',
      callType: ApiCallType.POST,
      headers: {
        'ngrok-skip-browser-warning': 'true',
        'Content-Type': 'application/json',
      },
      params: {},
      body: ffApiRequestBody,
      bodyType: BodyType.JSON,
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class GETDiabetesCall {
  static Future<ApiCallResponse> call() async {
    return ApiManager.instance.makeApiCall(
      callName: 'GET Diabetes',
      apiUrl: 'https://769f-186-233-101-23.ngrok-free.app/diabetes',
      callType: ApiCallType.GET,
      headers: {
        'ngrok-skip-browser-warning': 'true',
      },
      params: {},
      returnBody: true,
      encodeBodyUtf8: false,
      decodeUtf8: false,
      cache: false,
      isStreamingApi: false,
      alwaysAllowBody: false,
    );
  }
}

class ApiPagingParams {
  int nextPageNumber = 0;
  int numItems = 0;
  dynamic lastResponse;

  ApiPagingParams({
    required this.nextPageNumber,
    required this.numItems,
    required this.lastResponse,
  });

  @override
  String toString() =>
      'PagingParams(nextPageNumber: $nextPageNumber, numItems: $numItems, lastResponse: $lastResponse,)';
}

String _toEncodable(dynamic item) {
  return item;
}

String _serializeList(List? list) {
  list ??= <String>[];
  try {
    return json.encode(list, toEncodable: _toEncodable);
  } catch (_) {
    if (kDebugMode) {
      print("List serialization failed. Returning empty list.");
    }
    return '[]';
  }
}

String _serializeJson(dynamic jsonVar, [bool isList = false]) {
  jsonVar ??= (isList ? [] : {});
  try {
    return json.encode(jsonVar, toEncodable: _toEncodable);
  } catch (_) {
    if (kDebugMode) {
      print("Json serialization failed. Returning empty json.");
    }
    return isList ? '[]' : '{}';
  }
}
