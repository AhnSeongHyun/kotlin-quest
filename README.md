# kotlin-quest

## 퀘스트 1. 마을 대장장이에게 기본 무기를 받는다. ⚔️

- root path 에서 json 및 version 정보를 리턴한다. ⇒ 실패 ⇒ 게임오버/손절
- controller 지정했는데 왜 안될까?
- master knight 🤺 에게 문의
    - spring initializer 에서 dependency(web 등등 필요한것) 를 선택해라 해봐라.
- `RootController` 를 만들어서 퀘스트 클리어

```kotlin
    import com.ash84.app.Entity.AppInfo
    import org.springframework.web.bind.annotation.RestController
    import org.springframework.web.bind.annotation.GetMapping
    
    @RestController
    class RootController {
        @GetMapping("/")
        fun index() : AppInfo { return AppInfo("app", "1.0.0")
        }
    }
```


### Questions

- GetMapping 과 RequestMapping 의 차이는 무엇일까?
    - [https://countryxide.tistory.com/45](https://countryxide.tistory.com/45)

    > @RestController : @Controller + @ResponseBody 의 축약형으로써, 리턴값을 뷰리졸버로 매핑하지 않고 그대로 출력해준다. ⇒  뷰 랜더링을 타지 않고, string, json 을 리턴한다.

    > @GetMapping : @RequestMapping(method = RequestMethod.GET) 의 축약형으로써, 애너테이션만 보고 무슨 메소드 요청인지 바로 알아볼 수 있다.
    

### TODO

- [https://ktlint.github.io/](https://ktlint.github.io/) Makefile 로 formatter 연결해보기

---    