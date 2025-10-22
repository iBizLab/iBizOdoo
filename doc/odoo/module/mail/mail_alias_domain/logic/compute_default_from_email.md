## compute_default_from_email <!-- {docsify-ignore-all} -->

   

### 逻辑处理脚本

```
if (data.default_from && data.default_from.includes('@')) {
    data.default_from_email = data.default_from;
} else {
    data.default_from_email=data.default_from+'@'+data.name;
}
```
