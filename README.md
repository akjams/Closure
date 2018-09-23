## Closure in Go, Java, JavaScript, and Python

In each language: write a `makeCounter` function that holds a local `count` variable and returns a function that performs `incrementAndGet` on `count`.

* Go and JavaScript implementations are natural
* Python and Java require some unnatural workarounds to the obvious implementation
  * Python requires a `nonlocal count` declaration in `incrementAndGet`, or else it assumes `count` is a local variable and will throw `UnboundLocalError`
  * Java lambda's can only access [effectively final][1] outer variables. So `count` must be a wrapper around an `int`, instead of simply an `int`.

[1]: https://stackoverflow.com/questions/20938095/difference-between-final-and-effectively-final