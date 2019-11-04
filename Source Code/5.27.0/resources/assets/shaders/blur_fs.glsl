//
//  blur_fs.glsl
//  GLChart
//
//  Created by Pavel Kosov on 03/05/2017.
//  Copyright © 2017 IQOPTION. All rights reserved.
//


precision mediump float;

uniform vec2 u_Resolution;
uniform sampler2D u_Texture;
uniform vec4 u_Color;

varying vec2 v_TexCoord;

#define OFF_1_WEIGHT   1.411764705882353
#define OFF_2_WEIGHT   3.2941176470588234
#define OFF_3_WEIGHT   5.176470588235294
#define COLOR_0_WEIGHT 0.1964825501511404
#define COLOR_1_WEIGHT 0.2969069646728344
#define COLOR_2_WEIGHT 0.09447039785044732
#define COLOR_3_WEIGHT 0.010381362401148057

vec4 gaussianBlurRow(vec2 uv, vec2 direction) {
  vec4 color = vec4(0.0);
  vec2 off1 = vec2(OFF_1_WEIGHT) * direction;
  vec2 off2 = vec2(OFF_2_WEIGHT) * direction;
  vec2 off3 = vec2(OFF_3_WEIGHT) * direction;
  color += texture2D(u_Texture, uv) * COLOR_0_WEIGHT;
  color += texture2D(u_Texture, uv + off1) * COLOR_1_WEIGHT;
  color += texture2D(u_Texture, uv - off1) * COLOR_1_WEIGHT;
  color += texture2D(u_Texture, uv + off2) * COLOR_2_WEIGHT;
  color += texture2D(u_Texture, uv - off2) * COLOR_2_WEIGHT;
  color += texture2D(u_Texture, uv + off3) * COLOR_3_WEIGHT;
  color += texture2D(u_Texture, uv - off3) * COLOR_3_WEIGHT;
  return color;
}

vec4 gaussianBluredColor(float radius)
{
    vec2 pixs;
    pixs.x = 1.0 / u_Resolution.x;
    pixs.y = 1.0 / u_Resolution.y;

    vec2 dirX = pixs * vec2(1.0, 0.0) * radius;
    vec2 dirY = pixs * vec2(0.0, 1.0) * radius;

    vec4 result = vec4(0.0);
    vec2 off1 = vec2(OFF_1_WEIGHT) * dirY;
    vec2 off2 = vec2(OFF_2_WEIGHT) * dirY;
    vec2 off3 = vec2(OFF_3_WEIGHT) * dirY;
    result += gaussianBlurRow(v_TexCoord, dirX) * COLOR_0_WEIGHT;
    result += gaussianBlurRow(v_TexCoord - off1, dirX) * COLOR_1_WEIGHT;
    result += gaussianBlurRow(v_TexCoord + off1, dirX) * COLOR_1_WEIGHT;
    result += gaussianBlurRow(v_TexCoord - off2, dirX) * COLOR_2_WEIGHT;
    result += gaussianBlurRow(v_TexCoord + off2, dirX) * COLOR_2_WEIGHT;
    result += gaussianBlurRow(v_TexCoord - off3, dirX) * COLOR_3_WEIGHT;
    result += gaussianBlurRow(v_TexCoord + off3, dirX) * COLOR_3_WEIGHT;

    return result;
}

vec4 doBlur(vec2 step, vec2 curPix)
{
    const float part = 1.0 / 13.0;
    vec4 result = texture2D(u_Texture, curPix) * part;
    result += texture2D(u_Texture, curPix + step * 1.0 * 1.0) * part;
    result += texture2D(u_Texture, curPix - step * 1.0 * 1.0) * part;
    result += texture2D(u_Texture, curPix + step * 2.0 * 1.2) * part;
    result += texture2D(u_Texture, curPix - step * 2.0 * 1.2) * part;
    result += texture2D(u_Texture, curPix + step * 3.0 * 1.3) * part;
    result += texture2D(u_Texture, curPix - step * 3.0 * 1.3) * part;
    result += texture2D(u_Texture, curPix + step * 4.0 * 1.4) * part;
    result += texture2D(u_Texture, curPix - step * 4.0 * 1.4) * part;
    result += texture2D(u_Texture, curPix + step * 5.0 * 1.6) * part;
    result += texture2D(u_Texture, curPix - step * 5.0 * 1.6) * part;
    result += texture2D(u_Texture, curPix + step * 6.0 * 1.8) * part;
    result += texture2D(u_Texture, curPix - step * 6.0 * 1.8) * part;
    return result;
}

vec4 getBluredColor()
{
    vec2 pixs;
    pixs.x = 1.0 / u_Resolution.x;
    pixs.y = 1.0 / u_Resolution.y;
    vec2 stepX = pixs;
    vec2 stepY = pixs;
    stepX.y = 0.0;
    stepY.x = 0.0;

    vec2 coord = v_TexCoord;
    const float part = 1.0 / 13.0;
    vec4 result = doBlur(stepX, coord) * part;
    result += doBlur(stepX, coord + stepY * 1.0 * 1.0) * part;
    result += doBlur(stepX, coord - stepY * 1.0 * 1.0) * part;
    result += doBlur(stepX, coord + stepY * 2.0 * 1.2) * part;
    result += doBlur(stepX, coord - stepY * 2.0 * 1.2) * part;
    result += doBlur(stepX, coord + stepY * 3.0 * 1.3) * part;
    result += doBlur(stepX, coord - stepY * 3.0 * 1.3) * part;
    result += doBlur(stepX, coord + stepY * 4.0 * 1.4) * part;
    result += doBlur(stepX, coord - stepY * 4.0 * 1.4) * part;
    result += doBlur(stepX, coord + stepY * 5.0 * 1.6) * part;
    result += doBlur(stepX, coord - stepY * 5.0 * 1.6) * part;
    result += doBlur(stepX, coord + stepY * 6.0 * 1.8) * part;
    result += doBlur(stepX, coord - stepY * 6.0 * 1.8) * part;
    return result;
}


void main()
{
    vec4 blured = getBluredColor();
    gl_FragColor = u_Color * blured;
}



