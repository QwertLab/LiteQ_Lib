# LiteQ
# Sample Project

> LiteQ SDK 최신버전은 3.1.0 버전입니다.

자세한 내용은 <a href="https://api.qwertlab.com/liteq/index.php" taregt="_blank">API Document 사이트</a>에서 확인해보실 수 있습니다.

<br>
<h3>연동가이드</h3>
<hr>

* settings.gradle(Project Settings) 설정

> LiteQ SDK는 Maven 저장소를 통해 배포되고 있습니다. settings.gradle 파일에 LiteQ Maven 정보를 등록합니다.
<br>

```java
    dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
            google()
            mavenCentral()
            
            //-- For ADQ SDK -----------------------------------
            maven { 
              url 'https://sdk.qwertlab.com/repository/internal' 
            }
            //---------------------------------------------------
          
        }
    }
```
<br>

* build.gradle(Module:) 설정


> LiteQ SDK를 dependencies에 implementation 합니다.
<br>


```java
    ...

    android {
      buildTypes {
      
          //-- FOR LiteQ -------------------------------------------------------------------------------
          debug {
              ndk {
                  debugSymbolLevel 'SYMBOL_TABLE'
              }
          }
          release {
              ndk {
                  debugSymbolLevel 'SYMBOL_TABLE'
              }
          }
          //------------------------------------------------------------------------------------------
          
      }
    }
    
    ...

    dependencies {

        ...
        
        //-- FOR LiteQ -------------------------------------------------------------------------------
        implementation 'com.qwertlab.liteq:LiteQ:3.1.0'
        
        ...
    }
    
    ...
```

<br>

* 프로가드 설정


> 프로가드를 사용하지 않는다면 이 단계를 건너뛰어주세요. <br>
만약 귀사의 앱 프로젝트에서 프로가드를 사용중이시면 proguard-rules.pro 파일에 ADQ 라이브러리를 예외처리합니다.

<br>

```java
   ... 

    #- For ADQ SDK
    
    -keep class com.qwertlab.liteq.**{*;}
    -dontwarn com.qwertlab.liteq.**
    
    ... 
          
```

<br>

* 연동 API 호출

> 귀사의 메인 액티비티의 onCreate() Method에 LiteQ API를 호출합니다.
  
<br>

```java
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ...
        
        //-- LiteQ SDK Call ------------------------------------------------------------------------
        LiteQManager.initLiteQ(MainActivity.this, "AgentKey");
        //------------------------------------------------------------------------------------------
        
        ....
        
    }
```

<br>

* 연동확인

> LiteQManger로 로그 검색을 통해 연동이 잘되었는지 확인합니다.

<p align="center">
<img src='https://api.qwertlab.com/images/liteq/log.png' />
</p>

<br>

보다 더 자세한 내용을 확인하고 싶으시다면 아래의 링크 정보를 통해서 확인해보실 수 있습니다.

* <a href="https://api.qwertlab.com/liteq/index.php">API Document</a>
* <a href="https://agent.qwertlab.com/">회원가입</a>
* <a href="https://www.qwertlab.com//">홈페이지</a>


<br>

<h3>License</h3>
<hr>

```java

Copyright © 2019-2023 QwertLab Inc. All Rights Reserved.

```




