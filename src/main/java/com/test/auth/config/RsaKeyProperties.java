package com.test.auth.config;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
 * プロパティファイルのプロパティに対応するJava BeanをDIコンテナに登録し、 
 * @ConfigurationPropertiesアノテーションをつけることで、
 * プロパティ値が各フィールドにインジェクションされる
 */
@ConfigurationProperties(prefix = "rsa")
public record RsaKeyProperties(RSAPublicKey publicKey, RSAPrivateKey privateKey) {
//recordクラス...フィールドが private finalで強制され、オブジェクトが変更不可になる
}
