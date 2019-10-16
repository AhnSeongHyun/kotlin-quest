# The Kotlin-SpringBoot Quests 
> kotlin-spring boot master 가 되기 위한 여정 🧘🏻‍♂️



## 퀘스트 1-1. root path 에서 json 및 version 정보를 리턴한다. 
- 보상 : 마을 대장장이에게 기본 무기를 받는다. ⚔️
- controller 추가했는데 왜 안될까?
- master knight 🤺 에게 문의
    - spring initializer 에서 dependency(web 등등 필요한것) 를 선택해봐라.
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

## 퀘스트 1-2. `UserService` 를 만들고, CRUD REST API ROUTE 를 연결해라. 
- 보상 : 마을 대장장이에게 갑옷과 기타 장비를 받는다. 🥋

- Controller/UserController 의 일부
```kotlin
    @RequestMapping(method=[RequestMethod.POST])
    fun add(@RequestBody payload:Map<String, Any>) {
        val user = User(payload["name"].toString(),
                payload["age"].toString().toInt(),
                payload["email"].toString())
        this.userService.add(user)
    }
```

- User Entity 

```kotlin
data class User(val name:String, val age: Int, val email:String)
```

## 퀘스트 1-3. HTTP 200 이 아닌 다른 http status code 리턴을 한다. 에러가 난 경우 500을 리턴한다. 
- 보상 : 마을 촌장에게 퀘스트2 를 수행할 수 있는 넘어갈 수 있는 지도를 받는다. 🏞 
- TODO 

### Questions

- GetMapping 과 RequestMapping 의 차이는 무엇일까?
    - [https://countryxide.tistory.com/45](https://countryxide.tistory.com/45)

    > @RestController : @Controller + @ResponseBody 의 축약형으로써, 리턴값을 뷰리졸버로 매핑하지 않고 그대로 출력해준다. ⇒  뷰 랜더링을 타지 않고, string, json 을 리턴한다.

    > @GetMapping : @RequestMapping(method = RequestMethod.GET) 의 축약형으로써, 애너테이션만 보고 무슨 메소드 요청인지 바로 알아볼 수 있다.
    

### TODO

- [https://ktlint.github.io/](https://ktlint.github.io/) Makefile 로 formatter 연결해보기

---    