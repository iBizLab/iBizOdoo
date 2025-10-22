## 密码(PASSWORD) <!-- {docsify-ignore-all} -->

   

### 两次密码不一致 :id=PASSWORD

```plantuml
@startuml
hide empty description
<style>
root {
  HyperlinkColor #42b983
}
</style>

state "start" as start  <<start>>
state "end" as end <<end>>
state "[条件组]OR" as fa54ff1a0bacae57823dd5bcb0f6f39a [[$./password#afa54ff1a0bacae57823dd5bcb0f6f39a {"[条件组]OR"}]] {
state " " as fa54ff1a0bacae57823dd5bcb0f6f39a_entry  <<entryPoint>>
state "(sure_password) 值为空(Nil)" as b0e03f9c5b65d851a063dd7cfe5f09a8 [[$./password#ab0e03f9c5b65d851a063dd7cfe5f09a8 {"[常规条件] 值为空(Nil)"}]]
state "(NEW_PASSWORD) 值为空(Nil)" as 6c9669e98f84e2c07333f4a7e61cf9a5 [[$./password#a6c9669e98f84e2c07333f4a7e61cf9a5 {"[常规条件] 值为空(Nil)"}]]
state "(sure_password) 等于(=) 数据对象属性 (new_password)" as 71905883e3624ad4ff7ec8da0ba11678 [[$./password#a71905883e3624ad4ff7ec8da0ba11678 {"[常规条件] 等于(=) 数据对象属性 (new_password)"}]]
state " " as fa54ff1a0bacae57823dd5bcb0f6f39a_exit  <<exitPoint>>
}


start --> fa54ff1a0bacae57823dd5bcb0f6f39a_entry 
fa54ff1a0bacae57823dd5bcb0f6f39a_entry --> b0e03f9c5b65d851a063dd7cfe5f09a8 
b0e03f9c5b65d851a063dd7cfe5f09a8 --> fa54ff1a0bacae57823dd5bcb0f6f39a_exit  : yes
b0e03f9c5b65d851a063dd7cfe5f09a8 -[#red]-> 6c9669e98f84e2c07333f4a7e61cf9a5  : no

6c9669e98f84e2c07333f4a7e61cf9a5 --> fa54ff1a0bacae57823dd5bcb0f6f39a_exit  : yes
6c9669e98f84e2c07333f4a7e61cf9a5 -[#red]-> 71905883e3624ad4ff7ec8da0ba11678  : no

71905883e3624ad4ff7ec8da0ba11678 --> fa54ff1a0bacae57823dd5bcb0f6f39a_exit  : yes
71905883e3624ad4ff7ec8da0ba11678 -[#red]-> end  : no
fa54ff1a0bacae57823dd5bcb0f6f39a_exit --> end 


@enduml
```

#### 条件说明

##### (sure_password) 等于(=) 数据对象属性 (new_password) :id=a71905883e3624ad4ff7ec8da0ba11678



`sure_password` EQ  `new_password`

> [!ATTENTION|label:规则信息|icon:fa fa-warning]
> 两次输入的密码不一致


##### (sure_password) 值为空(Nil) :id=ab0e03f9c5b65d851a063dd7cfe5f09a8



`sure_password` ISNULL 

##### (NEW_PASSWORD) 值为空(Nil) :id=a6c9669e98f84e2c07333f4a7e61cf9a5



`NEW_PASSWORD(设置密码)` ISNULL 


### 默认规则 :id=Default

```plantuml
@startuml
hide empty description
<style>
root {
  HyperlinkColor #42b983
}
</style>

state "start" as start  <<start>>
state "end" as end <<end>>
state "默认字符串长度" as 3129382910db637b0d96b7e040d7dafe [[$./password#a3129382910db637b0d96b7e040d7dafe {"默认字符串长度"}]]


start --> 3129382910db637b0d96b7e040d7dafe 
3129382910db637b0d96b7e040d7dafe --> end 


@enduml
```

#### 条件说明

##### 默认字符串长度 :id=a3129382910db637b0d96b7e040d7dafe


*关键条件*


`PASSWORD(密码)` 属性长度在区间 `(0 , 500]` 内

> [!ATTENTION|label:规则信息|icon:fa fa-warning]
> 内容长度必须小于等于[500]







