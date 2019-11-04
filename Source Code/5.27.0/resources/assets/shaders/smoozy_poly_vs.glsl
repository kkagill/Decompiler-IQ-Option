//
//  smoozy_poly_vs.glsl
//  GLChart
//
//  Created by Pavel Kosov on 14/04/2017.
//  Copyright © 2017 IQOPTION. All rights reserved.
//

attribute vec4 a_Position;
attribute vec4 a_Coeffs;
attribute vec4 a_Color;

varying vec2 v_CenterCoords;
varying vec4 v_Coeffs;
varying vec4 v_Color;

uniform float u_ScreenHeight;
uniform float u_Scale;
uniform mat4 u_TransMatrix;

void main()
{
    gl_Position = u_TransMatrix * a_Position;
    v_CenterCoords.x = a_Position.x * u_Scale;
    v_CenterCoords.y = (u_ScreenHeight - a_Position.y) * u_Scale;
    v_Color = a_Color;
    
    float dx = a_Position.x - a_Coeffs.x;
    float dy = a_Position.y - a_Coeffs.y;
    float lineLength = sqrt(dx * dx + dy * dy);
    v_Coeffs.x = abs(dx / lineLength);
    v_Coeffs.y = abs(dy / lineLength);
    v_Coeffs.zw = a_Coeffs.zw;
}
