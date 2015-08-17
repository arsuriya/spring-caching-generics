# spring-caching-generics
The effect of generics on spring caching

Known fixes for the error - *org.springframework.expression.spel.SpelEvaluationException: EL1007E:(pos 0): Property or
 field 'id2' cannot be found on null*
** Update the specific interface(s) IfDao1.java, IfDao2.java and uncomment the line that overrides the save method from the parent.
** Replace the reference to method parameter name in the @CacheEvict to #root.args[0]